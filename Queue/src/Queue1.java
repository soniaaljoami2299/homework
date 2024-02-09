public interface Queue1<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E e);
    E dequeue();
}

public class ArrayQueue<E> implements Queue1<E> {
    private static final int CAPACITY = 1000;
    private E[] data;
    private int front = 0;
    private int size = 0;

    public ArrayQueue() {
        data = (E[]) new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public void enqueue(E e) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (front + size) % data.length;
        data[avail] = e;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E temp = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return temp;
    }

    public void rotate() {
        if (size > 0) {
            E temp = dequeue();
            enqueue(temp);
        }
    }


    public class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }

    public class LinkedQueue<E> implements Queue1<E> {
        private Node<E> front;
        private Node<E> rear;
        private int size;

        public LinkedQueue() {
            front = null;
            rear = null;
            size = 0;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public E first() {
            if (isEmpty()) {
                return null;
            }
            return front.element;
        }

        @Override
        public void enqueue(E e) {
            Node<E> newNode = new Node<>(e);
            if (isEmpty()) {
                front = newNode;
            } else {
                rear.next = newNode;
            }
            rear = newNode;
            size++;
        }

        @Override
        public E dequeue() {
            if (isEmpty()) {
                return null;
            }
            E temp = front.element;
            front = front.next;
            size--;
            if (isEmpty()) {
                rear = null;
            }
            return temp;
        }
    }

/*
لمهمة الواجب، قمت بإضافة دالة rotate() إلى تنفيذ ArrayQueue التي تقوم بدوران العنصر الأول في القائمة. هذا يعني أن العنصر الأول يتم نقله إلى نهاية القائمة.
 هذا يتم بشكل أكثر كفاءة من استدعاء enqueue(dequeue()) مرتين، حيث لا يتم تعديل حجم القائمة.
 */






}








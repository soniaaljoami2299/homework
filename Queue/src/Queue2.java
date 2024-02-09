
public interface Queue2<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();
}
public class ArrayQueue<E> implements Queue<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    public void enqueue(E element) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        E element = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    public ArrayQueue<E> clone() {
        ArrayQueue<E> clonedQueue = new ArrayQueue<>(data.length);
        clonedQueue.size = this.size;
        clonedQueue.front = this.front;
        clonedQueue.rear = this.rear;
        clonedQueue.data = Arrays.copyOf(this.data, this.data.length);
        return clonedQueue;
    }
}

/*
تم تنفيذ الواجهة Queue في فئة ArrayQueue وتم استخدام مصفوفة لتخزين العناصر.
الأسلوب clone() يقوم بإنشاء نسخة مستقلة من الصف الأصلي. يتم إنشاء كائن جديد من ArrayQueue بنفس حجم المصفوفة والحقول الأخرى. ثم يتم نسخ قيم الحقول size و front و rear من الصف الأصلي إلى الصف المستنسخ. أخيرًا، يتم استنساخ المصفوفة باستخدام Arrays.copyOf().
بهذا الشكل، يمكنك استخدام الأسلوب clone() لإنشاء نسخة مستقلة من الصف الأصلي ArrayQueue.

*/


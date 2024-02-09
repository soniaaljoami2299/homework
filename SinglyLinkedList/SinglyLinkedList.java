public class SinglyLinkedList <E>{

        private Node<E> head;
        private int size;

        public SinglyLinkedList() {
            head = null;
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
                return null;
            }
            return head.getElement();
        }

        public E last() {
            if (isEmpty()) {
                return null;
            }

            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            return current.getElement();
        }

        public void addFirst(E element) {
            head = new Node<>(element, head);
            size++;
        }

        هل تود أن أواصل توضيح الطرق الأخيرة؟






    public class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
public class SinglyLinkedList<E> {
    private Node<E> head;
    private int size;

    public SinglyLinkedList() {
        head = null;
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
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        Node<E> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        size++;
    }


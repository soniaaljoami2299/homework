
    class SinglyLinkedList5<T> {

         public Node<T> head;
        private Node<T> tail;
        private int size;

        public SinglyLinkedList5() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public T first() {
            if (isEmpty()) {
                return null;
            }
            return head.data;
        }

        public T last() {
            if (isEmpty()) {
                return null;
            }
            return tail.data;
        }

        public void addFirst(T element) {
            Node<T> newNode = new Node<>(element);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void addLast(T element) {
            Node<T> newNode = new Node<>(element);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                return null;
            }
            T removedElement = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
            return removedElement;
        }
//---------------------------------------------------

 class Node<T> {
       T data;
       Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

//---------------------------------------------

        public void concatenate(SinglyLinkedList5<T> list) {
            if (list.isEmpty()) {
                return;
            }

            if (isEmpty()) {
                head = list.head;
                tail = list.tail;
                size = list.size;
            } else {
                tail.next = list.head;
                tail = list.tail;
                size += list.size;
            }
        }
    }


























    public class DoublyLinkedList <E> {
        private Node<E> header;
        private Node<E> trailer;
        private int size;

        public DoublyLinkedList() {
            header = new Node<>(null, null, null);
            trailer = new Node<>(null, header, null);
            header.setNext(trailer);
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
            return header.getNext().getElement();
        }

        public E last() {
            if (isEmpty()) {
                return null;
            }
            return trailer.getPrev().getElement();
        }

        public void addFirst(E element) {
            Node<E> newNode = new Node<>(element, header, header.getNext());
            header.getNext().setPrev(newNode);
            header.setNext(newNode);
            size++;
        }

        public void addLast(E element) {
            Node<E> newNode = new Node<>(element, trailer.getPrev(), trailer);
            trailer.getPrev().setNext(newNode);
            trailer.setPrev(newNode);
            size++;
        }

        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }
            Node<E> firstNode = header.getNext();
            E removedElement = firstNode.getElement();
            header.setNext(firstNode.getNext());
            firstNode.getNext().setPrev(header);
            firstNode.setPrev(null);
            firstNode.setNext(null);
            size--;
            return removedElement;
        }

        public E removeLast() {
            if (isEmpty()) {
                return null;
            }
            Node<E> lastNode = trailer.getPrev();
            E removedElement = lastNode.getElement();
            trailer.setPrev(lastNode.getPrev());
            lastNode.getPrev().setNext(trailer);
            lastNode.setPrev(null);
            lastNode.setNext(null);
            size--;
            return removedElement;
        }

        //-------------------------------------------


        public class Node<E> {
            private E element;
            private Node<E> prev;
            private Node<E> next;
            public Node(E element, Node<E> prev, Node<E> next) {
                this.element = element;
                this.prev = prev;
                this.next = next;
            }

            public E getElement() {
                return element;
            }

            public void setElement(E element) {
                this.element = element;
            }

            public Node<E> getPrev() {
                return prev;
            }

            public void setPrev(Node<E> prev) {
                this.prev = prev;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }


//-----------------------------------

        public Node<E> findMiddleNode() {
            Node<E> slow = header.getNext();
            Node<E> fast = header.getNext().getNext();

            while (fast != trailer && fast.getNext() != trailer) {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }

            return slow;
        }

    }














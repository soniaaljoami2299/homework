


    public class DoublyLinkedList3<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size;

        public DoublyLinkedList3() {
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

        public E first() {
            if (isEmpty()) {
                return null;
            }
            return head.data;
        }

        public E last() {
            if (isEmpty()) {
                return null;
            }
            return tail.data;
        }

        public void addFirst(E data) {
            Node<E> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast(E data) {
            Node<E> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }
            E removedData = head.data;
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            } else {
                head.prev = null;
            }
            return removedData;
        }

        public E removeLast() {
            if (isEmpty()) {
                return null;
            }
            E removedData = tail.data;
            tail = tail.prev;
            size--;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            return removedData;
        }

        private static class Node<E> {
            E data;
            Node<E> next;
            Node<E> prev;

            public Node(E data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }


    public boolean equals(DoublyLinkedList3<E> otherList) {
        if (size != otherList.size) {
            return false;
        }

        Node<E> currentThis = head;
        Node<E> currentOther = otherList.head;

        while (currentThis != null) {
            if (!currentThis.data.equals(currentOther.data)) {
                return false;
            }
            currentThis = currentThis.next;
            currentOther = currentOther.next;
        }

        return true;
    }

/*
    هذه الدالة تقارن بين قائمتين مزدوجتين وتعيد true إذا كانت متطابقة وfalse إذا لم تكن. يمكنك اختبار هذه الدوال للتأكد من أنها تعمل بشكل صحيح.


*/














    }













    public class DoublyLinkedList5<T> {
        private Node<T> sentinel;
        private int size;

        public DoublyLinkedList5() {
            sentinel = new Node<>(null);
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public T first() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return sentinel.next.data;
        }

        public T last() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return sentinel.prev.data;
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = sentinel.next;
            newNode.prev = sentinel;
            sentinel.next.prev = newNode;
            sentinel.next = newNode;
            size++;
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = sentinel;
            newNode.prev = sentinel.prev;
            sentinel.prev.next = newNode;
            sentinel.prev = newNode;
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            Node<T> firstNode = sentinel.next;
            sentinel.next = firstNode.next;
            firstNode.next.prev = sentinel;
            firstNode.next = null;
            firstNode.prev = null;
            size--;
            return firstNode.data;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            Node<T> lastNode = sentinel.prev;
            sentinel.prev = lastNode.prev;
            lastNode.prev.next = sentinel;
            lastNode.next = null;
            lastNode.prev = null;
            size--;
            return lastNode.data;
        }

        private static class Node<T> {
            public T data;
            public Node<T> prev;
            public Node<T> next;

            public Node(T data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }
        /*


قوم بتوضيح الكود الجديد الذي يستخدم عقدة واحدة فقط:

تم تعريف حقل واحد للإشارة إلى العقدة المراقبة (sentinel node) التي تحتوي على حقول للإشارة إلى العقدة السابقة والعقدة التالية.
تم تعديل جميع الوظائف لتتوافق مع العقدة الواحدة المراقبة.
يتم استخدام العقدة المراقبة لحماية الطرفين من القائمة، حيث يتم تعيين العقدة المراقبة لتكون العقدة التالية لآخر عنصر في القائمة والعقدة السابقة لأول عنصر في القائمة.

*/













    }




















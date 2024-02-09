public class DoublyLinkedList4 {

    public class Node<T> {
        public T data;
        public Node<T> prev;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }



    public class DoublyLinkedList<T> {
        private Node<T> head;
        private Node<T> tail;

        public DoublyLinkedList() {
            this.head = new Node<>(null);  // عقدة رأس القائمة
            this.tail = new Node<>(null);  // عقدة ذيل القائمة
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        // الوظائف الأساسية
        public boolean isEmpty() {
            return head.next == tail;
        }

        public int size() {
            int count = 0;
            Node<T> current = head.next;
            while (current != tail) {
                count++;
                current = current.next;
            }
            return count;
        }

        public T first() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return head.next.data;
        }

        public T last() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return tail.prev.data;
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = tail;
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            tail.prev = newNode;
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            Node<T> firstNode = head.next;
            head.next = firstNode.next;
            firstNode.next.prev = head;
            firstNode.next = null;
            firstNode.prev = null;
            return firstNode.data;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            Node<T> lastNode = tail.prev;
            tail.prev = lastNode.prev;
            lastNode.prev.next = tail;
            lastNode.next = null;
            lastNode.prev = null;
            return lastNode.data;
        }

        // خوارزمية لدمج قائمتين مزدوجتي الارتباط
        public DoublyLinkedList<T> concatenate(DoublyLinkedList<T> list1, DoublyLinkedList<T> list2) {
            DoublyLinkedList<T> concatenatedList = new DoublyLinkedList<>();

            if (list1.isEmpty()) {
                concatenatedList.head.next = list2.head.next;
                concatenatedList.tail.prev = list2.tail.prev;
            } else if (list2.isEmpty()) {
                concatenatedList.head.next = list1.head.next;
                concatenatedList.tail.prev = list1.tail.prev;
            } else {
                Node<T> list1Tail = list1.tail.prev;
                Node<T> list2Head = list2.head.next;

                list1Tail.next = list2Head;
                list2Head.prev = list1Tail;

                concatenatedList.head.next = list1.head.next;
                concatenatedList.tail.prev = list2.tail.prev;
            }

            return concatenatedList;
        }


/*

concatenate(): هذه الوظيفة تقوم بدمج قائمتين مزدوجتي الارتباط.

إذا كانت إحدى القوائم فارغة، فإن القائمة المدموجة ستكون نسخة من القائمة الأخرى.
إلا إذا كانت كلا القوائم فارغتين، فيتم إنشاء قائمة مدموجة فارغة.
إلا إذا كانت القوائم مليئة بالعناصر، فإن القائمة المدموجة ستكون نسخة من القائمة الأولى، ويتم ربط ذيل القائمة الأولى برأس القائمة الثانية



 */




    }




















}

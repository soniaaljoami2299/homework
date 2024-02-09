public class DoublyLinkedList7 {

    public class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public class DoublyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public DoublyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public int first() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return head.data;
        }

        public int last() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            return tail.data;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            tail.next = head;
            head.prev = tail;
            size++;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            tail.next = head;
            head.prev = tail;
            size++;
        }

        public int removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            int data = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;
            return data;
        }

        public int removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("القائمة فارغة.");
            }
            int data = tail.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            size--;
            return data;
        }

        public DoublyLinkedList clone() {
            DoublyLinkedList clonedList = new DoublyLinkedList();
            Node current = head;
            while (current != null) {
                clonedList.addLast(current.data);
                current = current.next;
            }
            return clonedList;
        }
    }

/*
يتم إرالسؤال المطلوب هو تنفيذ طريقة clone() في فئة DoublyLinkedList. هذه الطريقة تهدف إلى إنشاء نسخة من القائمة المزدوجة المتصلة الحالية.
في تنفيذ الطريقة clone()، يتم إنشاء قائمة مزدوجة جديدة تكون فارغة في البداية. ثم يتم استعراض القائمة المزدوجة الأصلية ونسخ عناصرها إلى القائمة المزدوجة المستنسخة باستخدام طريقة addLast().

بمجرد انتهاء عملية النسخ، يتم إرجاع القائمة المزدوجة المستنسخة للاستخدام.

وبهذا يتم تنفيذ طريقة clone() التي تقوم بإنشاء نسخة من القائمة المزدوجة المتصلة.

Share



Tell me more.
ما هي وظيفة الطريقة `clone()` في فئة `DoublyLinkedList`؟
هل يمكنني استخدام الطريقة `clone()` لنسخ قائمة مزدوجة متصلة فارغة؟
هل يمكنني استخدام الطريقة `clone()` لنسخ قائمة مزدوجة متصلة تحتوي على عناصر؟


*/












}

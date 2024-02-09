public class DoublyLinkedList6 {

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

        public void rotate() {
            if (!isEmpty()) {
                head = head.next;
                tail = tail.next;
            }
        }

        public void rotateBackward() {
            if (!isEmpty()) {
                head = head.prev;
                tail = tail.prev;
            }
        }
    }


/*

الطريقة rotate() تقوم بتدوير القائمة عن طريق نقل مؤشرات الرأس والذيل خطوة واحدة إلى الأمام.
الطريقة rotateBackward() تقوم بتدوير القائمة في الاتجاه المعاكس بنقل مؤشرات الرأس والذيل خطوة واحدة إلى الخلف.
السؤال يطلب تنفيذ نسخة دائرية من القائمة المزدوجة المتصلة بدون أي عقدات وهمية (sentinels)، والتي تدعم جميع سلوكيات العمومة للقائمة الأصلية، وتضم اثنين من الأساليب التحديثية الجديدة rotate() و rotateBackward() لتدوير القائمة في اتجاه عقارب الساعة وعكس عقارب الساعة على التوالي.

*/







    
}

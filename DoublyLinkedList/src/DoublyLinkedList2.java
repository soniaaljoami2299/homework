public class DoublyLinkedList2 {

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

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public int first() {
            if (isEmpty()) {
                throw new IllegalStateException("The list is empty.");
            }
            return head.data;
        }

        public int last() {
            if (isEmpty()) {
                throw new IllegalStateException("The list is empty.");
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
        }

        public int removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("The list is empty.");
            }
            int data = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return data;
        }

        public int removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("The list is empty.");
            }
            int data = tail.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return data;
        }
    }
/*
    حسنًا! سأقدم لك حلاً لمشكلتك. يتطلب الأمر حساب حجم القائمة عن طريق اختبار كل عقدة في القائمة وعد العقد التالي حتى نصل إلى العقدة الأخيرة. هنا يأتي الحل بلغة الجافا:

    في هذا الحل، نقوم بتنفيذ الصف العقدة (Node) الذي يحتوي على بيانات ومؤشرين (prev و next). ثم نقوم بتنفيذ الصف DoublyLinkedList الذي يحتوي على الطرق المطلوبة. وتشمل هذه الطرق: التحقق مما إذا كانت القائمة فارغة (isEmpty)، استرداد العنصر الأول والأخير (first و last)، إضافة عنصر في البداية والنهاية (addFirst و addLast)، إزالة العنصر من البداية والنهاية (removeFirst و removeLast).

    تابع الطريقة size() نفس المنطق المستخدم في الحل السابق بلغة Python. نقوم بتعيين متغير العداد (count) إلى القيمة صفر ونبدأ من الرأس. ثم نتحقق مما إذا كانت العقدة الحالية مختلفة عن القيمة null ونزيد قيمة العداد بواحد في كل تكرار. في النهاية، ستكون قيمة العداد هي حجم القائمة.

*/






}

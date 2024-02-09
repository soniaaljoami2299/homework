public class SinglyLinkedList4 {

    public class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public class SinglyLinkedList<T> {
        private Node<T> head;
        private Node<T> tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            int count = 0;
            Node<T> current = head;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }

        public T first() {
            if (isEmpty()) {
                return null;
            }
            return head.getData();
        }

        public T last() {
            if (isEmpty()) {
                return null;
            }
            return tail.getData();
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }

        public void removeFirst() {
            if (isEmpty()) {
                return;
            }
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        }

        public void rotate() {
            if (isEmpty() || head == tail) {
                return;
            }
            Node<T> oldHead = head;
            head = head.getNext();
            oldHead.setNext(null);
            tail.setNext(oldHead);
            tail = oldHead;
        }
    }
/*
    بالطبع! هنا هو تنفيذ طريقة `rotate()` في فئة `SinglyLinkedList` والتي تقوم بتحقيق نفس النتيجة كـ `addLast(removeFirst())` دون إنشاء أي عقدة جديدة:

    شرح الطريقة `rotate()`:

            1. نتحقق من أن القائمة ليست فارغة وأن العقدة الرأسية ليست نفس العقدة الأخيرة. إذا كانت الشروط غير صحيحة، فإننا لا نقوم بأي عمل إضافي ونعود فورًا.

            2. نقوم بتخزين العقدة القديمة للعقدة الرأسية في متغير `oldHead`.

            3. نقوم بتحديث العقدة الرأسية لتصبح العقدة التالية.

4. نضبط الرابط القديم للعقدة الرأسية (التي تمت إزالتها) على `null`.

            5. نقوم بربط العقدة الأخيرة الحالية بالعقدة القديمة للعقدة الرأسية.

6. نقوم بتحديث العقدة الأخيرة لتصبح العقدة القديمة للعقدة الرأسية.

    بهذه الطريقة، يتم تحقيق نفس النتيجة كـ `addLast(removeFirst())` بدون إنشاء أي عقدة جديدة.

    */







}

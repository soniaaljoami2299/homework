public class SinglyLinkedList6 {

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

        public void reverse() {
            if (isEmpty() || head == tail) {
                return; // لا يوجد عقد أو عقدة واحدة فقط، لا يوجد شيء يحتاج إلى عكسه
            }

            Node<T> previous = null;
            Node<T> current = head;
            Node<T> next = null;

            while (current != null) {
                next = current.getNext();
                current.setNext(previous);
                previous = current;
                current = next;
            }

            // تحديث الروابط الأولية للقائمة المتصلة
            tail = head;
            head = previous;
        }
    }
/*

    reverse(): يقوم بعكس ترتيب العقد في القائمة المتصلة. يتم أخذ ثلاثة مؤشرات previous و current و next وتهيئتها بالترتيب للإشارة إلى العقدة السابقة والعقدة الحالية والعقدة التالية على التوالي
    . يتم استخدام حلقة while للانتقال عبر القائمة المتصلة من البداية إلى النهاية. في كل تكرار من الحلقة،

     يتم تحديث الروابط لعكس العقدة الحالية. بعد الانتهاء من الحلقة
     ، يتم تحديث رأس القائمة ليشير إلى العقدة الأخيرة (التي كانت العقدة الأولى في القائمة الأصلية) و ذيل القائمة ليشير إلى العقدة الأولى (التي كانت العقدة الأخيرة في القائمة الأصلية).
 */








}

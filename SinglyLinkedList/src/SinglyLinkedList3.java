public class SinglyLinkedList3 {

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

        public SinglyLinkedList() {
            this.head = null;
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
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            return current.getData();
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(head);
            head = newNode;
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
        }

        public void removeFirst() {
            if (isEmpty()) {
                return;
            }
            head = head.getNext();
        }
    }


  /*

    هنا هو تنفيذ الطريقة size() للفئة SinglyLinkedList بدون الاحتفاظ بمتغير الحجم كمتغير فئة:



   شرح الطريقة `size()`:

            1. نقوم بتهيئة المتغير `count` بقيمة صفر. هذا المتغير سيستخدم لحساب حجم القائمة.

            2. نقوم بتهيئة المتغير `current` ليشير إلى رأس القائمة المتصلة.

3. نكرر عبر القائمة المتصلة حتى نصل إلى العقدة الأخيرة (عندما يكون `current` هو `null`). في كل تكرار، نزيد قيمة المتغير `count` بواحد وننقل `current` إلى العقدة التالية.

4. في النهاية، نعود بقيمة المتغير `count` والتي تمثل حجم القائمة.

    هذه الطريقة تعتمد على عدد العقد التي يتم عبورها أثناء حساب الحجم، وتعمل بتعقيد زمني O(n)، حيث n هو عدد العقد في القائمة المتصلة.
    */


}

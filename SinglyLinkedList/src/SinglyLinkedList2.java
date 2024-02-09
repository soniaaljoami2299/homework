public class SinglyLinkedList2 {

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
        private int size;

        public SinglyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
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
            size++;
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
            size++;
        }

        public void removeFirst() {
            if (isEmpty()) {
                return;
            }
            head = head.getNext();
            size--;
        }

        public Node<T> findSecondToLastNode() {
            if (size < 2) {
                return null;
            }
            Node<T> current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            return current;
        }
    }


    /*

   البحث عن العقدة الثانية من الأخير في قائمة متصلة بشكل مفرد.



    شرح لطريقة `findSecondToLastNode`:

            1. أولاً ، نتحقق مما إذا كان حجم القائمة المتصلة أقل من 2. إذا كان الأمر كذلك ، يعني ذلك أنه ليس هناك عدد كافٍ من العقد للعثور على العقدة الثانية من الأخير ، وبالتالي نعود بقيمة `null`.

            2. نقوم بتهيئة متغير `current` ليشير إلى رأس القائمة المتصلة.

3. نكرر عبر القائمة المتصلة حتى تصبح العقدة التي تلي العقدة التالية لـ `current` هي `null`. هذا يضمن أن العقدة `current` تشير إلى العقدة الثانية من الأخير.

            4. أخيرًا ، نعود بالعقدة `current` ، والتي تمثل العقدة الثانية من الأخير في القائمة المتصلة.

    يرجى ملاحظة أن هذه الخوارزمية لها تعقيد زمني يبلغ O(n) ، حيث n هو عدد العقد في القائمة المتصلة ، حيث يتم عبور القائمة مرة واحدة فقط.


*/


}

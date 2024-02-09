public class CircularyLinkedList6 {

    // Node class
    class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // CircularlyLinkedList class
    class CircularyLinkedList6 {
        private Node head;
        private int size;

        public CircularyLinkedList6() {
            this.head = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public int first() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return head.data;
        }

        public int last() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return head.next.data;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                newNode.next = newNode;
            } else {
                newNode.next = head;
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = newNode;
            }
            head = newNode;
            size++;
        }

        public void addLast(int data) {
            if (isEmpty()) {
                addFirst(data);
            } else {
                Node newNode = new Node(data);
                newNode.next = head;
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = newNode;
                size++;
            }
        }

        public void removeFirst() {
            if (isEmpty()) {
                return; // or throw an exception
            }
            if (size == 1) {
                head = null;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next;
                head = head.next;
            }
            size--;
        }

        public void rotate() {
            if (!isEmpty()) {
                head = head.next;
            }
        }

        // Method to split a circularly linked list into two lists of half the size
        public CircularyLinkedList6[] splitList() {
            CircularlyLinkedList[] splitLists = {new CircularyLinkedList6(), new CircularyLinkedList6()};

            if (size % 2 != 0) {
                // Not an even number of nodes, return empty lists
                return splitLists;
            }

            int count = 0;
            Node current = head;

            while (count < size / 2) {
                splitLists[0].addLast(current.data);
                current = current.next;
                count++;
            }

            while (count < size) {
                splitLists[1].addLast(current.data);
                current = current.next;
                count++;
            }

            return splitLists;
        }

        // Implementing the clone method for CircularlyLinkedList
        public CircularyLinkedList6 clone() {
            CircularyLinkedList6 clonedList = new CircularyLinkedList6();

            if (isEmpty()) {
                return clonedList; // Return an empty list
            }

            Node current = head;

            do {
                clonedList.addLast(current.data);
                current = current.next;
            } while (current != head);

            return clonedList;
        }
    }

/*
    بالنسبة للسؤال في الواجب، يُطلب منك وصف كيفية تقسيم قائمة متجانسة دائرية L التي تحتوي على عدد زوجي من العناصر إلى قائمتين متجانستين، كل منهما يحتوي على نصف حجم القائمة الأصلية. يمكنك استخدام الدالة splitList() التي تم تضمينها في الكود أعلاه لتحقيق ذلك. ستقوم هذه الدالة بإنشاء وإرجاع قائمتين جديدتين تحتوي كل واحدة على نصف عناصر القائمة الأصلية.

    أما بالنسبة لدالة clone() التي تم تضمينها في الكود، فهي تقوم بإنشاء نسخة جديدة مستقلة من القائمة المتجانسة الدائرية الحالية. يتم نسخ جميع العناصر إلى القائمة الجديدة وإعادة هذه القائمة المُنسخة كنتيجة.

*/






}

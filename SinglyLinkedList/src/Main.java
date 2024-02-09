
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList5<Integer> list1 = new SinglyLinkedList5<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        SinglyLinkedList5<Integer> list2 = new SinglyLinkedList5<>();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        list1.concatenate(list2);


       SinglyLinkedList5<Integer>.Node<Integer> current = list1.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}













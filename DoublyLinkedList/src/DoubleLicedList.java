public class DoubleLicedList<E> {
    private Node<E>header;
    private Node<E>trailer;
    private int size=0;
     public DoubleLicedList(){
         header=new Node<>(null,null,null);

         trailer=new Node<>(null,header,null);
         header.setNext(trailer);


     }



    private static class Node<E>{

        E element;
        Node<E>prev;
        Node<E>next;

        public void setNext(Node<E> trailer) {
        }
    }

    public DoubleLicedList(Node<E> header, Node<E> trailer, int size) {
        this.header = header;
        this.trailer = trailer;
        this.size = size;
    }
    private E remove(Node<E>x){
         Node<E>p=x.prev;
         p.setNext(n);
        p.setPrev(p);
        size--;
        return x.element



    }
}

















public class Stack4 {

    import java.util.Arrays;

    public class ArrayStack<E> implements Stack<E> {
        private static final int DEFAULT_CAPACITY = 10;

        private E[] data;
        private int size;

        public ArrayStack() {
            this(DEFAULT_CAPACITY);
        }

        public ArrayStack(int capacity) {
            data = (E[]) new Object[capacity];
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public E top() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return data[size - 1];
        }

        public void push(E element) {
            if (size == data.length) {
                resize(2 * data.length);
            }
            data[size] = element;
            size++;
        }

        public E pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            E element = data[size - 1];
            data[size - 1] = null;
            size--;
            if (size > 0 && size == data.length / 4) {
                resize(data.length / 2);
            }
            return element;
        }

        private void resize(int capacity) {
            data = Arrays.copyOf(data, capacity);
        }

        public ArrayStack<E> clone() {
            ArrayStack<E> clonedStack = new ArrayStack<>(data.length);
            clonedStack.size = this.size;
            clonedStack.data = Arrays.copyOf(this.data, this.data.length);
            return clonedStack;
        }
    }
    /*




}

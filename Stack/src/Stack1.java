public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();
}

public class ArrayStack<E> implements Stack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] array;
    private int top;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    public void push(E element) {
        if (size() == array.length) {
            resize(2 * array.length);
        }
        top++;
        array[top] = element;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = array[top];
        array[top] = null;
        top--;
        if (size() > 0 && size() == array.length / 4) {
            resize(array.length / 2);
        }
        return element;
    }

    private void resize(int capacity) {
        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i <= top; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}

public class LinkedStack<E> implements Stack<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node<E> top;
    private int size;

    public LinkedStack() {
        top = null;
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
            throw new EmptyStackException();
        }
        return top.element;
    }

    public void push(E element) {
        top = new Node<>(element, top);
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = top.element;
        top = top.next;
        size--;
        return element;
    }
}

public class StackTransfer {
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}

/*الواجهة Stack تعرف الأساليب الأساسية التي يجب توفرها في الكومة.
فئة ArrayStack تنفذ الكومة باستخدام المصفوفة. تستخدم المصفوفة لتخزين العناصر وتقوم بتغيير حجم المصفوفة حسب الحاجة.
فئة LinkedStack تنفذ الكومة باستخدام القوائم المتصلة. تستخدم القائمة المتصلة لتخزين العناصر وتقوم بإضافة وإزالة العناصر من الرأس.
تم تنفيذ الأساليب الأساسية isEmpty() و size() و top() و push() و pop() وفقًا لوصفها في السؤال.
تم تنفيذ الطريقة transfer() التي تستخدم لنقلجميع العناصر من كومة S إلى كومة T بحيث يتم إدراج العنصر الذي يبدأ في الجزء العلوي من S أولاً في T، وينتهي العنصر في الجزء السفلي من S في الجزء العلوي من T.
*/
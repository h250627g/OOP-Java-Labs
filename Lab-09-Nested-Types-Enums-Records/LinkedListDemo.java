
import java.util.Iterator;
import java.util.NoSuchElementException;

class CustomLinkedList<T> implements Iterable<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public void add(T item) {
        Node<T> node = new Node<>(item);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T value = current.data;
            current = current.next;
            return value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        CustomLinkedList<String> names = new CustomLinkedList<>();

        names.add("Amanda");
        names.add("Brian");
        names.add("Tanatswa");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

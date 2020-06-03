package pl.p.lodz.zzpj2020.generics.task1.model;

public class OneWayList<T extends Step> {
    private Node<T> head = new Node<>(null, null);
    private int size = 0;

    public void add(T element) {
        if(head.getValue() == null) {
            head = new Node<>(element, null);
        }
        else {
            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<>(element, null));
        }
        size++;
    }

    public void addAll(OneWayList<T> list) {
        getNode(size - 1).setNext(list.head);
        size += list.size;
    }

    private Node<T> getNode(int n){
        if(n > size || isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> it = head;
        for(int i = 0; i < n; i++) {
            it = it.getNext();
        }
        return it;
    }

    public T getElement(int n) {
        return getNode(n).getValue();
    }

    public void clear() {
        head.setNext(null);
        head.setValue(null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

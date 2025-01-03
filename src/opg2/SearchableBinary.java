package opg2;

import java.util.ArrayList;
import java.util.List;

public class SearchableBinary<E extends Comparable<E>> extends SearchPattern<E> {
    private int left, right, index;
    private List<E> list;

    public SearchableBinary(List<E> list) {
        this.list = list;
    }

    @Override
    protected void init() {
        list.sort((E e1, E e2) -> e1.compareTo(e2));
        left = 0;
        right = list.size();
        index = -1;
    }

    @Override
    protected boolean isEmpty() {
        return list.isEmpty() || index >= list.size() || left > right;
    }

    @Override
    protected E select() {
        int middle = (left + right) / 2;
        return list.get(middle);
    }

    @Override
    protected void split(E m) {
        int middle = (left + right) / 2;
        E current = list.get(middle);
        int comp = current.compareTo(m);
        if (comp > 0) right = middle - 1;
        else left = middle + 1;
    }
}

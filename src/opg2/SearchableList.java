package opg2;

import java.util.Comparator;
import java.util.List;

public class SearchableList<E extends Comparable<E>> extends SearchPattern<E> {
    private List<E> list;
    private int index;
    private E current;

    public SearchableList(List<E> list) {
        this.list = list;
    }

    @Override
    protected void init() {
        index = 0;
        current = list.get(0);
    }

    @Override
    protected boolean isEmpty() {
        return list.isEmpty() || index >= list.size();
    }

    @Override
    protected E select() {
        return list.get(index);
    }

    @Override
    protected void split(E m) {
        index++;
    }

}

package opg3;

import javax.sound.midi.Sequence;
import java.util.Iterator;
import java.util.List;

public class ListSekvens<E> implements Sekvens<E>{
    private List<E> list;

    public ListSekvens(List<E> list) {
        this.list = list;
    }

    @Override
    public void add(E element) {
        list.add(element);
    }

    @Override
    public void addAll(Sekvens<E> seq) {
        while (seq.iterator().hasNext()) list.add(seq.iterator().next());
    }

    @Override
    public E head() {
        return list.get(list.size());
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public void tail() {
        list.remove(list.size());
    }
}

package opg3;

import java.util.Iterator;

public interface Sekvens<E> {
    // Add the element at the end of the sequence.
    void add(E element);

    // Add all objects from the sequence at the end of this sequence, keeping the order.
    void addAll(Sekvens<E> seq);

    // Return the first element in the sequence.
// Pre: The sequence is not empty.
    E head();

    // Return true if the sequence is empty.
    boolean isEmpty();

    // Return an iterator.
    Iterator<E> iterator();

    // Remove the first element in the sequence.
// Pre: The sequence is not empty.
    void tail();
}

package io.turntablUnit;

import java.util.LinkedList;
import java.util.List;

public class Bag<E> {
    private List<E> collections = new LinkedList<>();

    public void add(E el) { this.collections.add(el); }
    public void remove(E el){this.collections.remove(el); }
    public void clear(){this.collections.clear();}

}

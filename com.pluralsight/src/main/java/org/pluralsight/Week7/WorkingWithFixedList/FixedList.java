package org.pluralsight.Week7.WorkingWithFixedList;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }
    public FixedList(int maxSize, List<T> items) {
        this.maxSize = maxSize;
        this.items = items;
    }

    public void add(T item) {
        if(items.size() < this.maxSize ) {
            items.add(item);
        } else {
            System.out.println("Max sized reached.");
        }
    }

    public List<T> getItems() {
        return items;
    }
}

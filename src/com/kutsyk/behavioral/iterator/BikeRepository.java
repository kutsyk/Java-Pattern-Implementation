package com.kutsyk.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BikeRepository implements Iterable<String>{

    private ArrayList<String> bikes = new ArrayList<>();
    private int index = 0;

    public void addBike(String bike) {
        bikes.add(bike);
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.size();
            }

            @Override
            public String next() {
                return bikes.get(currentIndex++);
            }
        };
        return it;
    }
}

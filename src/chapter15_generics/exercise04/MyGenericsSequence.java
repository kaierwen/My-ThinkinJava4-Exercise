package chapter15_generics.exercise04;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.ArrayList;
import java.util.List;

interface MyGenericsSelector<T> {
    boolean end();

    T current();

    void next();
}

public class MyGenericsSequence<T> {
    private List<T> items;
    private int next = 0;

    public MyGenericsSequence(List<T> items) {
        this.items = items;
    }

    public void add(T x) {
        if (next < items.size())
            items.add(x);
    }

    private class MySequenceSelector implements MyGenericsSelector<T> {
        private int i = 0;

        public boolean end() {
            return i == items.size();
        }

        public T current() {
            return items.get(i);
        }

        public void next() {
            if (i < items.size()) i++;
        }
    }

    public MyGenericsSelector<T> selector() {
        return new MySequenceSelector();
    }

    public static void main(String[] args) {
        // Int
        List<Integer> data1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data1.add(i);
        }
        MyGenericsSequence<Integer> mySequence1 = new MyGenericsSequence(data1);
        MyGenericsSelector<Integer> mySelector1 = mySequence1.selector();
        while (!mySelector1.end()){
            System.out.print(mySelector1.current() + " ");
            mySelector1.next();
        }

        System.out.println();

        // String
        List<String> data2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data2.add("str" + i);
        }
        MyGenericsSequence<String> mySequence2 = new MyGenericsSequence(data2);
        MyGenericsSelector<String> mySelector2 = mySequence2.selector();
        while (!mySelector2.end()) {
            System.out.print(mySelector2.current() + " ");
            mySelector2.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

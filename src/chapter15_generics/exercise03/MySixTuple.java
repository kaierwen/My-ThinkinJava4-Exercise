package chapter15_generics.exercise03;

import net.mindview.util.FiveTuple;

import static ptmoskal.Print.print;

public class MySixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;

    public MySixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.sixth = f;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ", " + sixth + ")";
    }

    public static void main(String[] args) {
        MySixTuple mark = new MySixTuple("Mark", "age = ", 12, "isMan = ", true, 1.22);
        print(mark);
//        mark.sixth = 1;
    }
}

package chapter15_generics.exercise02;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

import static ptmoskal.Print.print;

public class MyHolder<T> {

    private T a,b,c;

    MyHolder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public static void main(String[] args) {
        MyHolder<Pet> h = new MyHolder<>(new Pet(), new Cat(), new Dog());
        print(h.getA());
        print(h.getB());
        print(h.getC());

//        Pet
//        Cat
//        Dog
    }
}

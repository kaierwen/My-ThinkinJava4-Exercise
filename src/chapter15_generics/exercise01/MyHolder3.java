package chapter15_generics.exercise01;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

import static ptmoskal.Print.print;

public class MyHolder3<T> {
//	private T a;
//	public Holder3(T a) { this.a = a; }
//	public void set(T a) { this.a = a; }
//	public T get() { return a; }
//	public static void main(String[] args) {
//		Holder3<Pet> h3 = new Holder3<Pet>(new Pet());
//		Pet a = h3.get(); // No cast needed
//		print(a);
//		h3.set(new Cymric());
//		print(h3.get());
//	}

    private T data;
    MyHolder3(T t) {
        this.data = t;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        MyHolder3<Pet> h3 = new MyHolder3(new Pet());
        print(h3.data);
        h3.setData(new Cat());
        print(h3.data);
    }
}

/* Output:
Pet
Cymric
*/
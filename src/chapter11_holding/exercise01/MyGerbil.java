package chapter11_holding.exercise01;

import java.util.ArrayList;

public class MyGerbil {

    private int gerbilNumber;

    int getGerbilNumber() {
        return gerbilNumber;
    }

    public MyGerbil(int number) {
        this.gerbilNumber = number;
    }

    void hop() {

    }

    public static void main(String[] args) {
        ArrayList<MyGerbil> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new MyGerbil(i));
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j) + " , " + list.get(j).gerbilNumber);
        }
        for (MyGerbil item : list) {
            System.out.println(item.gerbilNumber);
        }
    }
}

package oop.inheritanceExample.modArrayList;

public class Main {

    public static void main(String[] args) {

        ModArrayLIst modArrayLIst = new ModArrayLIst();

        modArrayLIst.add("Hello World");
        modArrayLIst.add(123);
        modArrayLIst.add(321);

        System.out.println(modArrayLIst);

        modArrayLIst.remove(1);
        System.out.println(modArrayLIst);
    }
}



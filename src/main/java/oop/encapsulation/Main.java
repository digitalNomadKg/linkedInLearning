package oop.encapsulation;

import oop.encapsulation.types.Arachnids;
import oop.encapsulation.types.Insects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> arrayList = new ArrayList<String>(10);
    final static Scanner scanner = new Scanner(System.in);

    public static Arachnids arachnid = new Arachnids("", "", 0);
    public static Insects insect = new Insects("", "", 0);


    public static void main(String[] args) {

        arachnid.setName("Tarantul");
        arachnid.setType("Spider");
        arachnid.setLivingPeriod(45);
        System.out.println("Arachnid is - " + arachnid.getName() +
                "\n" + " type is: " + arachnid.getType() +
                "\n" + " living period: " + arachnid.getLivingPeriod() + " years");
        System.out.println();

        insect.setName("BugBounty");
        insect.setType("Bug");
        insect.setLivingPeriod(1);
        System.out.println("Insect is - " + insect.getName() +
                "\n" + " type is: " + insect.getType() +
                "\n" + " living period: " + insect.getLivingPeriod() + " years");




    }
}



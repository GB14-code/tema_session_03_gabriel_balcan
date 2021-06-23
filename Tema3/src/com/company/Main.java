package com.company;

import java.lang.*;
import java.util.*;

public class Main {

    public static void hello(String nume) {
        if (nume.equals(""))
            System.out.println("Hello, stranger.");
        else {
            System.out.println("Hello, " + nume + "!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nume = input.nextLine();
        hello(nume);
    }
}

package Base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Nation = input.next();
        String edu = input.next();
        int age = input.nextInt();


        try {
            Person p = new Person(Nation,age,edu);
        } catch (PersonException e) {
            e.printStackTrace();
        }


    }
}

package exercises;

import java.util.Scanner;

/*
 * 1. Create a class called Ocean.
 * 2. There make make a SeaCreature called “Spongebob”. 
 * 3. Use the methods below to make him eat, and laugh.
 * 4. Make Patrick and Squidward and print their name, and make them laugh.
 */
public class Ocean {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                SeaCreature spongebob = new SeaCreature("Spongebob");
                SeaCreature patrick = new SeaCreature("Patrick");
                SeaCreature squidward = new SeaCreature("Squidward");

                boolean isStop = false;

                while (!isStop) {
                        System.out.println("1. Make Spongebob eat, laugh");
                        System.out.println("2. Make Patrick eat, laugh");
                        System.out.println("3. Make Squidward eat, laugh");
                        System.out.println("0. Exit");

                        String option = sc.nextLine().trim();

                        switch (option) {
                                case "1":
                                        spongebob.eat();
                                        spongebob.laugh();
                                        break;

                                case "2":
                                        patrick.eat();
                                        patrick.laugh();
                                        break;

                                case "3":
                                        squidward.eat();
                                        squidward.laugh();
                                        break;

                                case "0":
                                        isStop = true;
                        }
                }
        }
}

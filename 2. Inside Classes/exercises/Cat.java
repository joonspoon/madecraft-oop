package exercises;

import java.util.Scanner;

public class Cat {

        private String name;
        private int lives = 9;

        Cat(String name) {
                this.name = name;
        }

        void meow() {
                System.out.println("meeeeeooooooooooowwwwwwwww!!");
        }

        public void printName() {
                if (name == null)
                        System.out.println("i don't know my own name!");
                else 
                        System.out.println("my name is " + name);
        }

        void kill() {
                lives--;
                if (lives > 0) 
                        System.out.println("nice try, but I still have " + lives + " lives left");
                else if (lives < 0) 
                        System.out.println("that's overkill yo!");
                else 
                        System.out.println("DEAD CAT :(");
        }

        public static void main(String[] args) {
                /* Do the following things without changing the Cat class */
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Cat name:");
                String name = sc.nextLine().trim();

                Cat cat = new Cat(name);

                boolean isStop = false;

                while (!isStop) {
                        System.out.println("1. Make the Cat meow");
                        System.out.println("2. Get the Cat to print it's name");
                        System.out.println("3. Kill the Cat!");
                        System.out.println("0. Exit");

                        String option = sc.nextLine();

                        switch (option) {
                                case "1":
                                        // 1. Make the Cat meow
                                        cat.meow();
                                        break;

                                case "2":
                                        // 2. Get the Cat to print it's name
                                        cat.printName();
                                        break;

                                case "3":
                                        // 3. Kill the Cat!
                                        cat.kill();
                                        break;

                                case "0":
                                        // 0. Exit
                                        isStop = true;

                                default:
                                        System.out.println("Try again!");
                        }
                }

        }
}

package examples;

public class Pond {

        public static void main(String[] args) {

                Duck mobyDuck = new Duck("Moby", 90 / 3, "celery");
                Duck wolfgangDuck = new Duck("Wolfgang", 60 / 3, "cheeseburgers");

                mobyDuck.waddle();
                mobyDuck.waddle();
                mobyDuck.waddle();
                mobyDuck.waddle();
                mobyDuck.waddle();
                mobyDuck.waddle();
                mobyDuck.waddle();

                wolfgangDuck.waddle();

                System.out.println(mobyDuck);

                // Exercise: Make the Duck quack
                mobyDuck.quack();
        }

}

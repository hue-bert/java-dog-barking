import java.util.Scanner;

public class DogBarking {

    /*public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the dog barking: true or false");
        boolean barking = reader.nextBoolean();
        System.out.println("What time is it?");
        int time = reader.nextInt();
        System.out.println(shouldWakeUp(barking, time));
    }*/

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay <= 0 || hourOfDay >= 23) {
            return false;
        } else if (barking && hourOfDay < 8) {
            return true;

        } else {
            return false;
        }

    }
}

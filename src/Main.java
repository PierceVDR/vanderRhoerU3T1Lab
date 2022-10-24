public class Main {
    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        final int DRIVING_AGE = 16;

        int myAge = 17;

        boolean canVote = (myAge >= VOTING_AGE);
        boolean canDrive = (myAge >= DRIVING_AGE);

        System.out.println("I can vote: " + canVote);
        System.out.println("I can drive: " + canDrive);

        int yourAge = 18;

        boolean sameAge = (myAge == yourAge);
        System.out.println("We're the same age: " + sameAge);

        int num1 = 13;
        boolean isEven = (num1 % 2 == 0);
        System.out.println(num1 + " is even: " + isEven);

        boolean weird = (num1 <= 15) == (yourAge > 20);
        System.out.println(weird);

    }
}
public class FirstChallenge {
    public static void main(String[] args) {

        double myDouble = 20d;
        double mySecondDouble = 80d;
        double myTotal = (myDouble + mySecondDouble)*100d;

        System.out.println("Result of the two numbers : " +myTotal);

        double myRemainder = myTotal % 40d;

        System.out.println("Result of the remainder : " +myRemainder);

        boolean letSee = (myRemainder == 0) ? true : false;

        if (letSee == false) {

            System.out.println("Got some remainder.");
        }


    }
}

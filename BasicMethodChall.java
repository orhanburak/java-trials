public class BasicMethodChall {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Burak",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Çağatay",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ümit",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gürkan",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Berkay",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName +" managed to get into position " +playerPosition +" on the highscore list.");

    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        }
        else if(playerScore >= 500 && playerScore<1000) {
            position = 2;
        }
        else if(playerScore >= 100 && playerScore<500){
            position = 3;
        }

        return position;
    }

}

package method.test;

public class SimpleDotComGameTest {
    public static void main(String[] args) {
        method.SimpleDotComGame simpleDotComGame = new method.SimpleDotComGame();

        int[] locations = {2,3,4};

        simpleDotComGame.setLocationCells(locations);

        String userGuess = "a";

        String result = simpleDotComGame.checkYourself(userGuess);
        String testResult  = "failed";
        if (result.equals("hit")){
            testResult="passed";
        }
        System.out.println(testResult);
    }
}

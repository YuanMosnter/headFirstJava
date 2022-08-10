package method;

public class SimpleDotComGame {

    int [] locationCells ;
    int numOfHits ;


    public String checkYourself(String stringGuess){

        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for (int cell:
        locationCells) {
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }

        }
if ( numOfHits == locationCells.length){
    result = "kill";
}
        System.out.println(result);
    return result;
    }

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    /*
    测试主要方法
     */
    public static void main(String[] args) {

        int numOfGuess = 0;

        GameHelper gameHelper = new GameHelper();

        SimpleDotComGame theDotCom = new SimpleDotComGame();

        int randomNum = (int) (Math.random()*5);

        int [] locations = {randomNum,randomNum+1,randomNum+2};
        //查看打印生成的随机字符串
        for (int location : locations) {
            System.out.println(location);
        }

        System.out.println();

        theDotCom .setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true){
            String guess = gameHelper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);

            numOfGuess++;

            if (result.equals("kill")){
                isAlive =false;
                System.out.println("you took " + numOfGuess +"guesses");
            }
        }


    }
}

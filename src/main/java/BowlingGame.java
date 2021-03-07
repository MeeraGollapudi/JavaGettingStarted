public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    // for each frame we get to roll twice so for 10 frames we get to roll maximum of 20 times.
    // Since you can get a strike or spare on the 10th frame, in that case you get an extra roll.
    // So the size of the array roll has to be 21 to store.
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        // Number of pins stuck will be stored in the array roll and the postfix operator is used to increment the index for the next roll.
        rolls[index++] = pins;
        if (pins == 10)                        //In case of a strike
                index++;

    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
//        SCORE += ROLLS[0] + ROLLS[1];
//        SCORE += ROLLS[2] + ROLLS[3];
//        SCORE += ROLLS[4] + ROLLS[5];
//        SCORE += ROLLS[6] + ROLLS[7];
//        SCORE += ROLLS[8] + ROLLS[9];
//        SCORE += ROLLS[10] + ROLLS[11];
//        SCORE += ROLLS[12] + ROLLS[13];
//        SCORE += ROLLS[14] + ROLLS[15];
//        SCORE += ROLLS[16] + ROLLS[17];
//        SCORE += ROLLS[18] + ROLLS[19];
        int k = 0;
        int firstRoll = 0;                                     // needed if it is a strike
        int total = 0;                                          //needed if it is spare

        for(int j = 0; j < 10; j++) {                         // variable j is number of frames
           // System.out.printf("firstRoll %d\n", firstRoll);
           //  System.out.printf("total %d\n", total);
            k = j * 2;                                        //each frame has two rolls - index is going in even numbers
            if(firstRoll == 10)                              //strike
                score += 2 * (rolls[k] + rolls[k+1]);
            else if(total == 10)                            //spare
                score += (2 * rolls[k]) + rolls[k+1];
            else
                score += rolls[k] + rolls[k+1];
            firstRoll = rolls[k];
            total = rolls[k] + rolls[k+1];

            //System.out.printf("score %d\n", score);
        }
        return score;
    }
}

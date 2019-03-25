package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, SCISSOR, PAPER;

    public RockPaperScissorHandSign getWinner() {
        if (this.equals(ROCK)) {
            return PAPER;
        }if (this.equals(PAPER)) {
            return SCISSOR;
        }
        return ROCK;
    }



    public RockPaperScissorHandSign getLoser() {
        if (this.equals(ROCK)) {
            return SCISSOR;
        }if (this.equals(PAPER)) {
            return ROCK;
        }
        return PAPER;
    }
    }


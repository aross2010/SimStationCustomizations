package prisoners_dilemma;

public class Cheat extends Strategy{

    public Cheat(Prisoner prisoner) {
        super(prisoner);
    }

    @Override
    public boolean cooperate() {
        return false;
    }
}

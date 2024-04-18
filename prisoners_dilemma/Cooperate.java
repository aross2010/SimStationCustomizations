package prisoners_dilemma;

public class Cooperate extends Strategy{
    public Cooperate(Prisoner prisoner) {
        super(prisoner);
    }

    @Override
    public boolean cooperate() {
        return true;
    }
}

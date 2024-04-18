package prisoners_dilemma;

public class Tit4Tat extends Strategy{

    public Tit4Tat(Prisoner prisoner) {
        super(prisoner);
    }

    @Override
    public boolean cooperate() {
        return !myPrisoner.getCheated();
    }
}
package prisoners_dilemma;

public abstract class Strategy {
    protected Prisoner myPrisoner;
    public Strategy(Prisoner prisoner){
        this.myPrisoner = prisoner;
    }
    public abstract boolean cooperate();
}

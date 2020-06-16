import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> fish;

    public River(){
        this.fish = new ArrayList<Salmon>();
    }

    public void addFish(Salmon salmon) {
        this.fish.add(salmon);
    }

    public int fishCount() {
        return this.fish.size();
    }

    // We don't want to use void since this fish will land in the bear's belly
    public Salmon removeFish() {
        return this.fish.remove(0);
    }
}

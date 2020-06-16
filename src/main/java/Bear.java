import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<Salmon>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void sleep() {
        this.belly.clear();
    }

    public void eatFishFromRiver(River river) {
        Salmon salmon = river.removeFish();
        belly.add(salmon);
    }
}

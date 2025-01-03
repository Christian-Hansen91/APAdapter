package opg3;


public class Team implements Comparable<Team> {
    private String name;
    private Weekday weekday;
    public Team(String name, Weekday weekday) {
        this.name = name;
        this.weekday = weekday;
    }
    public String getName() {
        return name;
    }
    public Weekday getWeekday() {
        return weekday;
    }
    public String toString() {
        return weekday + " - " + name;
    }
    @Override
    public int compareTo(Team other) {
        int comp = weekday.compareTo(other.getWeekday());
        if (comp == 0) {
            comp = name.compareTo(other.name);
        }
        return comp;
    }
}
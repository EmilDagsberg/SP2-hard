public abstract class NetBook extends Title {
    private int availability;
    private int reach;
    private int use;

    public NetBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public double getPoints() {
        return calculatePoints();
    }

    public abstract double calculatePoints();

    public int getAvailability() {
        return availability;
    }

    public int getReach() {
        return reach;
    }

    public int getUse() {
        return use;
    }

    public String getLiteratureType() {
        return super.getLiteratureType();
    }
}

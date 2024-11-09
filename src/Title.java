public abstract class Title implements Lendable {
    private String title;
    private String literatureType;
    private double rate;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
        this.rate = 0.067574;
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double getPoints();

    public abstract double getPages();

    public abstract double calculatePoints();
}
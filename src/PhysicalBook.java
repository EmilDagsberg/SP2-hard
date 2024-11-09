public abstract class PhysicalBook extends Title {
    public int copies;

    PhysicalBook(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;

    }

    public double getPoints() {
        return calculatePoints();
    }

    public abstract double calculatePoints();

    @Override
    public abstract double getPages();
}



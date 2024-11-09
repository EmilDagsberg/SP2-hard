public class PrintedBook extends PhysicalBook {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    public double calculatePoints() {
        return getPages() * calculateLiteraturePoints() * super.copies;
    }

    protected double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 3.00;
            case "LYRIK" -> 6.00;
            case "SKØN" -> 1.70;
            case "FAG" -> 1.00;
            default -> 0.00;
        };
    }

    @Override
    public double getPages() {
        return pages;
    }
}
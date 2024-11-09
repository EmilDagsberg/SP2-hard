public class AudioBook extends PhysicalBook implements IAudioBook {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    public double calculatePoints() {
        return (getPages()) * calculateLiteraturePoints() * super.copies;
    }

    protected double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 1.50;
            case "LYRIK" -> 3.00;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.50;
            default -> 0.00;
        };
    }

    @Override
    public int getDuration() {
        return durationInMinutes;
    }

    @Override
    public double getPages() {
        return this.durationInMinutes * 0.5;
    }
}
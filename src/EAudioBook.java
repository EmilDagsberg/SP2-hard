public class EAudioBook extends NetBook implements IAudioBook {
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    public double getPages() {
        return this.durationInMinutes * 0.5;
    }

    public double calculatePoints() {
        return getPages() * calculateLiteraturePoints() * ((super.getAvailability() * 0.5) + (super.getReach() * 5)) + super.getUse();
    }

    public int getDuration() {
        return durationInMinutes;
    }

    public double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 1.50;
            case "LYRIK" -> 3.00;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.50;
            default -> 0.00;
        };
    }
}

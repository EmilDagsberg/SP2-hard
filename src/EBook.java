public class EBook extends NetBook {
    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    public double getPages() {
        double pageCount = characters / 1800;

        if(illustrated) {
            pageCount *= 1.10;
        } else if(!illustrated) {
            pageCount += 20;
        }

        return pageCount;
    }

    public double calculatePoints() {
        return getPages() * calculateLiteraturePoints() * ((super.getAvailability() * 0.5) + (super.getReach() * 5)) + super.getUse();
    }

    public double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 3.00;
            case "LYRIK" -> 6.00;
            case "SKØN" -> 1.70;
            case "FAG" -> 1.00;
            default -> 0.00;
        };
    }
}

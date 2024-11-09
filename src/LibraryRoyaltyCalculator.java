public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author a1 = new Author("Haruki Murakami");
        a1.addTitle(new PrintedBook("Kafka on the Shore", "SKØN", 500, 400));
        a1.addTitle(new AudioBook("Norwegian Woord", "BI", 100, 500));
        a1.addTitle(new PrintedBook("1Q84", "SKØN", 250, 1000));

        // String.format forces the calculateTotalPay() down to two decimals.
        System.out.println(a1.getName() + ": " + String.format("%.2f", a1.calculateTotalPay()) + " kr");

        Author a2 = new Author("Tatsuki Fujimoto");
        a2.addTitle(new PrintedBook("Chainsaw Man", "TE", 350, 150));
        a2.addTitle(new PrintedBook("Fire Punch", "TE", 50, 200));
        a2.addTitle(new AudioBook("Goodbye, Eri", "FAG", 75, 60));

        System.out.println(a2.getName() + ": " + String.format("%.2f", a2.calculateTotalPay()) + " kr");

        Author a3 = new Author("Dmitry Glukhovsky");
        a1.addTitle(new EBook("Metro 2033", "SKØN", 80, 40, 150, 826200, false));
        a2.addTitle(new EAudioBook("Metro 2035", "FAG", 60, 30, 75, 1140));
        a3.addTitle(new EBook("Metro 2034", "SKØN", 80, 40, 150, 576000, true));

        System.out.println(a3.getName() + ": " + String.format("%.2f", a2.calculateTotalPay()) + " kr");

    }
}
import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> titles = new ArrayList<Title>();

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addTitle(Title titles) {
        this.titles.add(titles);
    }

    public float calculateTotalPay() {
        float totalPay = 0;
        for(Title t: titles) {
            totalPay += (float) t.calculateRoyalty();
        }
        return totalPay;
    }
}
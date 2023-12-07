import java.util.Comparator;

public class Candy extends Sweet {
    private double sugarContent;

    public Candy(String name, double weight, double sugarContent) {
        super(name, weight);
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public String getInfo() {
        return getName() + " - sugar content: " + getSugarContent() + " g in 100g";
    }

    public static class CandyComparator implements Comparator<Candy> {
        @Override
        public int compare(Candy candy1, Candy candy2) {
            return Double.compare(candy1.getSugarContent(), candy2.getSugarContent());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Candy)) {
            return false;
        }
        Candy other = (Candy) obj;
        return this.getName().equals(other.getName()) &&
                this.getWeight() == other.getWeight() &&
                this.getSugarContent() == other.getSugarContent();
    }
}

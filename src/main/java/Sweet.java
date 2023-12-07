public abstract class Sweet {
    private String name;
    private double weight;

    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public abstract String getInfo();
}

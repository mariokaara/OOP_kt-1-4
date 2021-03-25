public class Toit implements Comparable<Toit>{

    private String nimetus;
    private double hind;

    public Toit(String nimetus, double hind) {
        this.nimetus = nimetus;
        this.hind = hind;
    }

    public double getHind() {
        return hind;
    }

    @Override
    public String toString() {
        return "Toit nimetusega " + nimetus + "ja hinnaga " + getHind();
    }

    @Override
    public int compareTo(Toit o) {
        return Double.compare(this.getHind(), o.getHind());
    }
}

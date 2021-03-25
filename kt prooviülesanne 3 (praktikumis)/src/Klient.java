public class Klient {

    private String kliendiNimi;
    private double raha;

    public Klient(String kliendiNimi, double raha) {
        this.kliendiNimi = kliendiNimi;
        this.raha = raha;
    }

    public void setRaha(double raha) {
        this.raha = raha;
    }

    void maksa (Tellimus tellimus) {
        setRaha(raha-tellimus.summa());
    }
    void hinda(Tellimus tellimus) {
        int randInt = (int) (Math.random()*4+2);
        tellimus.getKuller().lisaHinnang(randInt);
    }

    @Override
    public String toString() {
        return "Klient: " + kliendiNimi + ". Raha taskus: " + raha;
    }
}

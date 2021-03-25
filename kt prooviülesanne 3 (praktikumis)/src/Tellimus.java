import java.util.ArrayList;
import java.util.List;

public class Tellimus {

    private Kuller kuller;
    private List<Toit> toidud = new ArrayList<>();

    public Tellimus(Kuller kuller) {
        this.kuller = kuller;
    }

    void lisaToit(Toit toit) {
        toidud.add(toit);
    }

    public Kuller getKuller() {
        return kuller;
    }

    double summa() {
        double summa = 0;
        for (Toit i: toidud) {
            summa += i.getHind();
        }
        return summa;
    }


    @Override
    public String toString() {
        return "Tellimuse kogumaksumus: " + summa() + " ja toitude arv " + toidud.size();

    }
}

import java.util.ArrayList;
import java.util.List;

public class Kuller {

    private String nimi;
    private List<Integer> hinnangud = new ArrayList<>();

    public Kuller(String nimi) {
        this.nimi = nimi;
    }

    void lisaHinnang(int hinne) {
        hinnangud.add(hinne);
    }

    double keskmineHinnang() {
        int summa = 0;
        int pikkus = hinnangud.size();
        for (Integer i: hinnangud) {
            summa += i;
        }
        return summa/pikkus;
    }

    @Override
    public String toString() {
        return "Kulleri nimi " + nimi + ". Keskmine hinnang " + keskmineHinnang();
    }
}

public class KampaaniaToit extends Toit{

    private int soodustusprotsent;

    public KampaaniaToit(String nimetus, double hind, int soodustusprotsent) {
        super(nimetus, hind);
        this.soodustusprotsent = soodustusprotsent;
    }

    public double getHind() {
        return super.getHind()*(100-soodustusprotsent)/100;
    }




}

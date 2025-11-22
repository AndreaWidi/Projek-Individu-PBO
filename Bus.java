import java.util.ArrayList;

public class Bus {

    private ArrayList<Penumpang> penumpangBiasa = new ArrayList<>();
    private ArrayList<Penumpang> penumpangPrioritas = new ArrayList<>();
    private ArrayList<Penumpang> penumpangBerdiri = new ArrayList<>();

    public static final int ONGKOS_BUS = 2000;
    private int totalPendapatan = 0;

    public Bus() {}

    private boolean layakPrioritas(Penumpang p) {
        return p.getKategori() == Kategori.PRIORITAS;
    }

    public boolean naikkanPenumpang(Penumpang p) {
        try {
            p.bayar(ONGKOS_BUS);
       } catch (SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
            return false;
        }

        int total = penumpangBiasa.size() + penumpangPrioritas.size() + penumpangBerdiri.size();
        if (total >= 40) {
            System.out.println("Bus penuh!");
            return false;
        }

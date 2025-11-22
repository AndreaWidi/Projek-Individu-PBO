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

        if (layakPrioritas(p)) {
            if (penumpangPrioritas.size() < 4) penumpangPrioritas.add(p);
            else if (penumpangBiasa.size() < 16) penumpangBiasa.add(p);
            else penumpangBerdiri.add(p);
        } else {
            if (penumpangBiasa.size() < 16) penumpangBiasa.add(p);
            else penumpangBerdiri.add(p);
        }

        totalPendapatan += ONGKOS_BUS;
        return true;
    }

    public boolean turunkanPenumpang(String nama) {
        for (Penumpang p : penumpangPrioritas) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                penumpangPrioritas.remove(p);
                return true;
            }
        }
        for (Penumpang p : penumpangBiasa) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                penumpangBiasa.remove(p);
                return true;
            }
        }
        for (Penumpang p : penumpangBerdiri) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                penumpangBerdiri.remove(p);

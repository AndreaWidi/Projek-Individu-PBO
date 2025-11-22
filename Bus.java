import java.util.ArrayList;

public class Bus {

    private ArrayList<Penumpang> penumpangBiasa = new ArrayList<>();
    private ArrayList<Penumpang> penumpangPrioritas = new ArrayList<>();
    private ArrayList<Penumpang> penumpangBerdiri = new ArrayList<>();

    public static final int ONGKOS_BUS = 2000;
    private int totalPendapatan = 0;

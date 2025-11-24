public class PenumpangPrioritas extends Penumpang {

    public PenumpangPrioritas(int id, String nama, int umur, boolean hamil) {
        super(id, nama, umur, hamil);
        this.kategori = Kategori.PRIORITAS;
    }


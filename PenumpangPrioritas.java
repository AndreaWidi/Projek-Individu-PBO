public class PenumpangPrioritas extends Penumpang {

    public PenumpangPrioritas(int id, String nama, int umur, boolean hamil) {
        super(id, nama, umur, hamil);
        this.kategori = Kategori.PRIORITAS;
    }

    @Override
    public String toString() {
        return "[Prioritas] ID:" + id + " - " + nama + 
               " (Umur " + umur + ", Hamil " + hamil + ", Saldo " + saldo + ")";
    }
}

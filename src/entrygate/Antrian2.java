package entrygate;

/**
 *
 * @author taufiq
 */
public class Antrian2 {
    
    //Atribut data
    private final List listPendaftaran;
    
    //Konsrtuktor Queue
    public Antrian2(){
        listPendaftaran = new List("antrian");
    }
    
    //Prosedur penyisipan data pada queue
    public void enqueue(Object object, int prioritty) {
        if (prioritty == 0) {
            listPendaftaran.sisipDiAkhir(object);
        }else{
            listPendaftaran.sisipDiAwal(object);
        }
    }
    
    //Fungsi mengambil data pada queue
    public Object dequeue() {
        return listPendaftaran.hapusDrDepan();
    }
    
    //Fungsi pengecekan apakah data kosong 
    public boolean kosong(){
        return listPendaftaran.kosong();
    }
    
    //Prosedur pencetakan data pada queue
    public void cetak(){
        listPendaftaran.cetak();
    }
    
    void cetak(String no, String nama, String prodi, boolean  kondisi) {
        listPendaftaran.cetak();
        //System.out.print(no+"."+nama"."+prodi+"\n");
    }
}

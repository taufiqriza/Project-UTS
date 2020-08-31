package entrygate;

/**
 *
 * @author taufiq
 */
public class Queue {
    
    //atribut data
    private final List listPendaftaran;
    
    public Queue(){
        listPendaftaran = new List("Pendaftaran");
    }
    
    //Penyisipan data queue
    public void enqueue(Object object, int priority){
        if (priority == 0){
            listPendaftaran.sisipDiAkhir(object);
        }else{
            listPendaftaran.sisipDiAwal(object);
        }
    }
    
    //Fungsi mengambil data pada queue
    public Object dequeue(){
        return listPendaftaran.hapusDrDepan();
    }
    
    //Fungsi pengecekan apakah fungsi kosong
    public boolean kosong(){
        return listPendaftaran.kosong();
    }
    
    //Prosedur mencetak data pada queue
    public void cetak(){
        listPendaftaran.cetak();
    }
    
    void cetak(String no, String nama, String prodi, boolean kondisi){
    listPendaftaran.cetak();
               System.out.println(no+"."+nama+","+prodi+"\n");
    }
    
}

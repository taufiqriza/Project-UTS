package entrygate;

/**
 *
 * @author taufiq
 */
public class List {
    
    //Atribut data
    public Node nodeAwal;
    public Node nodeAkhir;
    public String no;
    public String nama;
    public String prodi;
    
    //Construktor SLL
    public List(){
        this("list");
    }
    
    //Construktor SLL
    public List(String namaList){
        nama = namaList;
    }
    
    //Prosedur mentyisipkan data diawal 
    public void sisipDiAwal(Object dt){
        if (kosong()){
        nodeAwal = nodeAkhir = new Node(dt);
        }else{
            nodeAwal = new Node(dt, nodeAwal);
             }
    }
    
    //Prosedur menyisipkan data di akhir
    public void sisipDiAkhir(Object dt){
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        }else{
            nodeAkhir = nodeAkhir.next = new Node(dt);
             }
    }
    
    //Fungsi menghapus data dari depan
    public Object hapusDrDepan(){
        Object itemDihapus = null;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if(nodeAwal == nodeAkhir){
                nodeAwal = nodeAkhir = null;
            }else{
                nodeAwal = nodeAwal.next;
            }
        }
        return itemDihapus;
    }
    
    //Fungsi pengecekan apakah SLL kosong
    public boolean kosong(){
        return nodeAwal == null;
    }
    
    //Prsedur mencetak data
    public void cetak(){
        if (kosong()) {
            System.out.printf("Antrian Kosong \n", no, nama, prodi);
            return;
            }
            System.out.printf("Urutan Antrian : ", no, nama, prodi);
            Node sekarang = nodeAwal;
                    while (sekarang != null) {
                    System.out.printf("%s <--", sekarang.data);
                    sekarang = sekarang.next;
        }
        System.out.println("\n");
    }
}

package entrygate;

/**
 *
 * @author taufiq
 */
public class Node {
    
    //Atribut data
    Object data;
    Node next;
    
    //Construktor node
    Node(Object object){
        this(object, null);
    }
    
    //Konstruktor node
    Node(Object object, Node node){
        data = object;
        next = node;
    }
    
    //Fungsi pengambilan data
    Object getObject(){
        return data;
    }
    
    //Fungsi pengambilan pointer
    Node getNext(){
        return next;
    }
}


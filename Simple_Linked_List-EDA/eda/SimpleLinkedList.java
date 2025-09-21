package eda;

/**
 * Esta clase contiene las metodos para la creacion de una
 * lista enlazada simple.
 *
 * @author Alvaro Juan Ciriaco
 */
public class SimpleLinkedList {
    private int size;
    private Node first;

    public SimpleLinkedList() {
        this.size = 0;
        this.first = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    /**
     * Este metodo permite anadir un nuevo nodo a la lista
     * enlazada simple. Lo inserta siempre en la ultima posicion.
     * @param node contiene el nodo a insertar.
     */
    public void add(Node node) {
        if(isEmpty()) this.first = node;
        else {
            Node p = this.first;
            while(p.getNext() != null) {
                p = p.getNext();
            } p.setNext(node);
        } size++;
    }

    /**
     * Este metodo permite eliminar un nodo de la lista
     * en la posicion con valor [position]
     * @param position contiene la posicion del nodo a eliminar.
     */
    public void delete(int position) {

    }

    /**
     * Este metodo devuelve el nodo que se encuentra en la posicion
     * con valor [position]
     * @param position contiene la posicion del nodo a devolver
     * @return el nodo en la posicion [position]
     */
    public Node get(int position) {
        return null;
    }

    /**
     * Indica si la lista esta vacia o no.
     * @return devuelve [true] si y solo si la lista
     * no contiene ningun nodo. Devuelve [false] en caso
     * contrario.
     */
    public boolean isEmpty() {
        if(this.size == 0) return true;
        return false;
    }

    /**
     * Este metodo muestra por pantalla los nodos
     * que contiene la lista enlazada. Siempre desde la
     * primera posicion hasta la ultima.
     */
    public void show() {
        Node p = first;
        while(p != null) {
            System.out.println(p);
            p = p.getNext();
        }
    }
}

package eda;

/**
 * Esta clase contiene las metodos para la creacion de una
 * lista enlazada simple.
 *
 * @author Alvaro Juan Ciriaco
 */
//Clase que define la lista enlazada simple
public class SimpleLinkedList {
    private int size; //Numero de nodos en la lista
    private Node first; //Primer nodo de la lista

    //Constructor
    public SimpleLinkedList() {
        this.size = 0;
        this.first = null;
    }
    // Getters
    public int getSize() {
        return size;
    }
    //Setters
    public void setSize(int size) {
        this.size = size;
    }
    //Método para obtener el primer nodo
    public Node getFirst() {
        return first;
    }
    //Método para establecer el primer nodo
    public void setFirst(Node first) {
        this.first = first;
    }

    /**
     * Este metodo permite anadir un nuevo nodo a la lista
     * enlazada simple. Lo inserta siempre en la ultima posicion.
     * @param node contiene el nodo a insertar.
     */
    public void add(Node node) {
        if(isEmpty()) this.first = node; //Si la lista esta vacia, el nuevo nodo es el primero
        else {
            //Si no, recorremos la lista hasta el final
            Node p = this.first; //Puntero auxiliar que recorre la lista lo igualamos al primer nodo
            while(p.getNext() != null) { //Reccoremos la lista mientras el siguiente nodo no sea nulo
                p = p.getNext(); //Avanzamos al siguiente nodo igulando el puntero actual al siguiente
            } p.setNext(node); //Cuando salimos del bucle, p apunta al ultimo nodo. Enlazamos el nuevo nodo al final
        } size++; //Incrementamos el tamaño de la lista
    }

    /**
     * Este metodo permite eliminar un nodo de la lista
     * en la posicion con valor [position]
     * @param position contiene la posicion del nodo a eliminar.
     */
    public void delete(int position) {
    // Verificar si la posición es válida
    if (position < 0 || position >= size) {
        throw new IndexOutOfBoundsException("Posición inválida");
    }

    // Caso especial: eliminar el primer nodo desapuntando su referencia
    if (position == 0) {
        first = first.getNext();
        size--;
        return;
    }


    // De esta forma eliminamos el nodo porque dejamos de referenciarlo y el recolector de basura se encarga de liberarlo.
    // Para otros casos, necesitamos encontrar el nodo anterior al que queremos eliminar
    Node p = first; // Puntero auxiliar que recorre la lista lo igualamos al primer nodo
    for (int i = 0; i < position - 1; i++) { // Recorremos hasta el nodo anterior a la posición
        p = p.getNext(); // Igualamos el puntero actual al siguiente que es el que queremos eliminar
    }
    /** Ahora p es el nodo anterior al que queremos eliminar
    Hacemos que el nodo anterior apunte al siguiente del que eliminamos**/
    p.setNext(p.getNext().getNext());
    size--; 
}

    /**
     * Este metodo devuelve el nodo que se encuentra en la posicion
     * con valor [position]
     * @param position contiene la posicion del nodo a devolver
     * @return el nodo en la posicion [position]
     */
    public Node get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }

        /** 
        // Usando getSelf() para devolver el valor desde el propio nodo
        Node p = first; // Puntero auxiliar que recorre la lista lo igualamos al primer nodo
        for (int i = 0; i == position; i++) {
           p = p.getSelf(); // Avanzamos al siguiente nodo
        }
        **/

        // Usando getNext() para devolver el valor desde el anterior nodo
        Node p = first; // Puntero auxiliar que recorre la lista lo igualamos al primer nodo
        for (int i = 0; i < position; i++) {
            p = p.getNext(); // Avanzamos al siguiente nodo
        }
        return p; // Devolvemos el nodo en la posición especificada
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

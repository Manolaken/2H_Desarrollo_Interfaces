package eda;
//Clase que define un nodo de la lista enlazada simple
public class Node {
    private int content; //Contenido del nodo
    private Node next; //Referencia al siguiente nodo

    //Constructores
    public Node() {}

    //Constructor con parametros
    public Node(int content) {
        this.content = content;
        this.next = null;
    }

    //Getters and Setters
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    // Método para obtener el propio nodo
    public Node getSelf(){
        return this;
    }

    //Métodos para obtener el siguiente nodo
    public Node getNext() {
        return next;
    }

    //Método para establecer el siguiente nodo
    public void setNext(Node next) {
        this.next = next;
    }

    //Metodo toString para mostrar el contenido del nodo
    @Override
    public String toString() {
        return "Content = " + this.content;
    }
}

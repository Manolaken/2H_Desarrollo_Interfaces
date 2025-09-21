package eda;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> l = new ArrayList<>();
        SimpleLinkedList l = new SimpleLinkedList();
        Node n = new Node(20); //Creamos un nodo con valor 20
        Node n2 = new Node(-3); //Creamos un nodo con valor -3
        Node n3 = new Node(50); //Creamos un nodo con valor 50
        l.add(n); //Anadimos el nodo a la lista
        l.add(n2); //Anadimos el nodo a la lista
        l.add(n3); //Anadimos el nodo a la lista
        l.show(); //Mostramos la lista
        l.delete(1);
        System.out.println("Después de eliminar el nodo en la posición 1:");
        l.show(); //Mostramos la lista
        System.out.println("El nodo en la posición 1 es: " + l.get(1));
        
    }
}

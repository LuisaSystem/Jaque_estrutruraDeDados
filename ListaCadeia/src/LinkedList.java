public class LinkedList<T>{
    //node
    private static class Node<T>{
        public T data;
        public Node<T> next;
        public Node(T val){
            data = val;
            next = null;
        }
    }

    private Node<T> head;
    private int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    //append

    public void append(T val){
        Node<T> inserted = new Node<>(val);
        Node<T> current;

        if(head == null){
            head = inserted;
        }else {
            current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = inserted;
        }
        count++;
    }

    //programa principal

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.append("3");
        lista.append("5");
        lista.append("10");
        System.out.println("Lista = "+ lista.print());
    }

    private T print() {
        return null;
    }


}
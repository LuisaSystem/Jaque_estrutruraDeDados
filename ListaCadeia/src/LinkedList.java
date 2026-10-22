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

    //print
    public String print(){
        Node<T> current = head;
        String output = "";
        while (current != null){
            output += current.data + "  ";
            current = current.next;
        }
        return output;
    }

    //exclusão
    public String deleta(){
        Node<T> n = head;
        String gu = "";
        while (n != null){
            gu += n.data;
            if (gu == null){
                return n.toString();
            }
        }
        return gu;
    }

   /* public int size(){
        return count;
    }*/

    //adicionar elemento
    public String add(){
        Node<T> no = head;
        String don = "";
        while (no != null){
            don += no.data;
        }
        return don;
    }

    //posição
    public String posicao(){
        Node<T> jo = head;
        String gun = "";

        while (jo != null){
            gun += jo.data + "  ";
            jo = jo.next;
        }

        if (gun == null){
            return String.valueOf(-1);
        }

        return gun;
    }

    //deletar posição - especifica
    public String deletarPosicao(){
        Node<T> sas = head;
        String ma = "";

        while(sas != null){
            ma += sas.data + "  ";
            sas = sas.next;
        }

        if (sas.next == null){
            ma += sas.data;
            sas = sas.next;
        }

        return ma;
    }

    //programa principal

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        //lista "fixa"
        lista.append("3");
        lista.append("5");
        lista.append("10");
        lista.append("12");

        //as funções - de 1 à 5

        // 1.
        System.out.println("Lista = "+ lista.print());
        // 2.
        System.out.println("Lista = "+ lista.deleta());
        // 3.
        System.out.println("Lista = "+ lista.add());
        // 4.
        System.out.println("Lista = "+ lista.posicao());
        // 5.
        System.out.println("Lista = "+ lista.deletarPosicao());
    }




}
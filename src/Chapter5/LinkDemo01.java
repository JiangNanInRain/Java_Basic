package Chapter5;

class Node{
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class LinkDemo01 {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车厢1");
        Node n2 = new Node("车厢2");
        Node n3 = new Node("车厢3");
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);

        printNode(root);


    }
    public static void printNode(Node node){
        System.out.print(node.getData());
        while(node.getNext()!=null){
            node = node.getNext();
            System.out.print("->"+node.getData());
        }
    }


}

package Chapter5;

class LinkList{
    class Node{//节点定义成内部类
        private String data;
        private Node next;
        public Node(String data){
            this.data = data;
        }

        public void add(Node newNode){//增加节点
            if(this.next == null){
                this.next = newNode;
            }else {
                this.next.add(newNode);
            }

        }
        public void print(){//循环打印
            System.out.print(this.data);
            if(this.next!=null){
                System.out.print("->");
                this.next.print();
            }
        }

        public boolean search(String data){//寻找是否有该data存在
            if(data.equals(this.data)){
                return true;
            }else {
                if(this.next!=null){
                    return  this.next.search(data);
                }else {
                    return false;
                }
            }

        }

        public void delete(Node pre,String data){
            if(data.equals(this.data)){
                pre.next = this.next;
            }else {
                if(this.next!=null){
                    this.next.delete(this,data);
                }
            }
        }

    };

    private Node root;
    public void addNode(String data){
        Node newNode = new Node(data);
        if(this.root==null){
            this.root = newNode;
        }else {
            this.root.add(newNode);
        }
    }
    public void printNode(){
        if(this.root!=null){
            this.root.print();
        }
    }
    public boolean contains(String data){
        return this.root.search(data);
    }
    public void deleteNode(String data){
        if(this.contains(data)){
            if(data.equals(this.root.data)){
                this.root = this.root.next;
            }else {
                this.root.next.delete(root,data);
            }
        }
    }






}


public class LinkDemo2 {
    public static void main(String[] args) {
        LinkList head = new LinkList();
       System.out.println("nb");
       head.addNode("A");
        head.addNode("B");
        head.addNode("C");
        head.addNode("D");
        head.addNode("E");
        System.out.println("-----------------删除之前--------");
        head.printNode();
        head.deleteNode("C");
        head.deleteNode("D");
        System.out.println();
        System.out.println("-----------------删除之后-------------");
        head.printNode();
        System.out.println();
        System.out.println("是否存在节点A:"+head.contains("A"));
    }
}

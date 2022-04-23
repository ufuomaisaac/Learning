public class BinaryTrees {
    Nodes head;
    public static void main(String[] args){
        BinaryTrees linkedli = new BinaryTrees();
        linkedli.head = new Nodes(1);
        Nodes second = new Nodes(2);
        Nodes third = new Nodes(3);
        linkedli.head.next = second;
        second.next = third;
        linkedli.display();
        linkedli.sumValues();
    }
    public void display(){
        Nodes n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    public int sumValues(){
        int result = 0;
        Nodes n = head;
        while (n != null){
            result += n.data;
            n = n.next;
        }
        return result;
    }
}
class Nodes{
    int data;
    Nodes next;

    public Nodes(int data){
        this.data = data;
    }

}

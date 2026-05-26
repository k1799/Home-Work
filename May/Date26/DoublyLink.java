
package May.Date26;


public class DoublyLink {
    Node head;
    void insert(int data){
    Node n=new Node(data);
    if(head==null){
    head=n;
    }
    else{
    Node temp=head;
    while(temp.next!=null){
    temp=temp.next;
    }
    temp.next=n;
    n.prev=temp;
    }
    }
    void insertposition(int data,int pos){
    Node n=new Node(data);
    if(pos==1){
    n.next=head;
    if(head!=null){
    head.prev=n;
    }
    head=n;
    }
    Node temp=head;
    for(int i=1;i<pos-1&&temp!=null;i++){
    temp=temp.next;
    }
    if(temp==null){
        System.out.println("Invaild Position");
    }
    n.next=temp.next;
    n.prev=temp;
    if(temp.next!=null){
    temp.next.prev=n;
    }
    temp.next=n;
    }
    void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
    temp=temp.next;
    }
        System.out.println("null");
    }
}

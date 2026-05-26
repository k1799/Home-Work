
package May.Date26;


public class CircularDoublyLinkList {
   Node head;
   void insertHead(int data){
   Node newNode=new Node(data);
   if(head==null){
   head=newNode;
   head.next=head;
   head.prev=head;
   }
   Node tail = head.prev;
   newNode.next=head;
   newNode.prev=tail;
   
   tail.next=newNode;
   head.prev=newNode;
   
   head=newNode;
   }
   void insertTail(int data){
   Node newNode=new Node(data);
   if(head==null){
   head=newNode;
   head.next=head;
   head.prev=head;
   }
   Node tail=head.prev;
   tail.next=newNode;
   newNode.prev=tail;
   
   newNode.next=head;
   head.prev=newNode;
   }
   void insertAtPosition(int data,int position){
   Node newNode=new Node(data);
   if(position==1){
       insertHead(data);
   }
   Node temp=head;
       for (int i = 1; i < position-1; i++) {
           temp=temp.next;
       }
       Node nextNode=temp.next;
       
       temp.next=newNode;
       newNode.prev=temp;
       
       newNode.next=nextNode;
       nextNode.prev=newNode;
   }
   void display(){
   if(head==null) return;
   Node temp=head;
   
   do{
       System.out.print(temp.data+"<->");
       temp=temp.next;
   }while(temp!=head);
       System.out.println("HEAD");
   }
}

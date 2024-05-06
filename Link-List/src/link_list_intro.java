public class link_list_intro {
    Node head ;
    static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
        }
    }
    //printing the list
    public void printList(){
        //temp Node to access the elements
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp  = temp.next;//at the end reaches the nul...
        }
        System.out.println("");
    }
    /*In the context of a singly linked list, the head node itself does not have a next pointer.
     The head node serves as the starting point or the entry point to the linked list, and
     it points to the first node in the list through its reference.*/
    public void push(int data){
        // head ==> 1 -> 2 -> 3 -> null
        Node newNode = new Node(data);
        //head initially points to the first node in the linked list (1)
        //We create a new node temp with the value "data".
        newNode.next = head;//i.e pointing to whatever the head points heare pointing to 1
        head = newNode;//head now is referencing to newNode
    }
    /* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
    public void insertAfter_given_Node(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

	/* 2. Allocate the Node &
	3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }
    public void delete_at_data(int data){
        String err = "Element to be deleted not found";
        if(head != null){
            if(head.next == null){
                if(head.data!=data) System.out.println(err);
                else head = null;
            }
            else{
                Node temp = head;
                boolean found = true;
                while(temp.next != null&&temp.next.data != data){
                    temp = temp.next;
                    if(temp.next==null&&temp.data!=data){
                        found = false;
                    }
                }
                if(!found){
                    System.out.println(err);
                }
                else {
                    // assert temp.next != null;
                    if (temp.next.next == null) {
                      temp.next = null;
                    }
                    else{

                    }
                }
            }
        }
    }
    /*
    If node is null
    Initially, head is null.
     push(head, 5) with head as null and x as 5 :
    A new node temp is created with the value 5.
    The next pointer of the new node temp is set to null (as there are no nodes after it yet).
    The head is updated to point to the new node temp, making it the first node in the linked list.
    */
    /*
    Consider a simple linked list with three nodes: 1 -> 2 -> 3 -> null

    Using temp != null: If we use temp != null as
    the condition in a traversal loop, it means that
    the loop will continue as long as temp is not null.
    In this case, the loop will iterate three times,
    visiting each node in the linked list

    Using temp.next != null: If we use temp.next != null
    as the condition in a traversal loop, it means that the
    loop will continue as long as the next node of temp is not
    null. In this case, the loop will iterate two times, visiting
    the first and second nodes in the linked list.
    */
    public void insert_at_end(int data){
        Node newNode = new Node(data);
        if(head==null)head = newNode;
        Node temp = head;
        //1 -> 2 -> 3 -> null | We will be traversing to the second last element
        while(temp.next != null){//at second - last count i.e data = 2
            temp = temp.next;// tamp = 3 i.e incremented to last count
        }
        //reached at 3
        temp.next = newNode;//initially temp.next was pointing to null now pointing to newNode

    }
   public void insert_after(int data,int value){
        Node temp = head;
        boolean found = true;
     //  System.out.println(temp.data);//head is pointing the first data..
        while(temp.next!=null&&temp.data!=data){
            temp = temp.next;
          //  System.out.println(temp.data);
            if(temp.next==null&&temp.data!=data)found = false;
        }
        if(!found) System.out.println("Element to insert after not found!!!");
        else {
            Node newNode = new Node(value);
            if (temp == null) temp = newNode;
            newNode.next = temp.next;
            temp.next = newNode;
        }
   }
   public void delete_begin(){
        if(head!=null){
            head = head.next;
        }
   }
    public void deleteNode_without_knowing_head(ListNode node) {
        ListNode after = node.next;//we are getting the data of Next node
        node.val = after.val;//copy the value of next node;
        //after is reference to the next node of targeted node
        //now make the current node to point to the next node of after which is basically the next node of targeted node
        node.next = after.next;
        //break the connection of the next node using reference node after
        after.next = null;
    }
    public static void main(String[] args) {
        link_list_intro list = new link_list_intro();
        list.head = new Node(0);
        Node prev = list.head;
        for(int i =1;i<=10;i++){
            Node newNode = new Node(i);
            list.insertAfter_given_Node(prev,i);
        }
        list.push(100);//100 will be the new head node
        list.push(50);
        list.insert_after(10,120);
        list.insert_at_end(1000);
        list.printList();
        list.delete_begin();
        list.printList();
        list.delete_at_data(1000);
        list.printList();
    }
}

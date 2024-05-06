/*
Given a linked list of size N. The task is to complete the function countNodesinLoop()
that checks whether a given Linked List contains a loop or not and if the loop is present
        then return the count of nodes in a loop or else return 0. C is the position of the node
to which the last node is connected. If it is 0 then no loop.

Example 1:
Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. So
length of loop is 33->10->21->39->
        90->58->45 = 7. The number 33 is
connected to the last node to form the
loop because according to the input the
4th node from the beginning(1 based
        index) will be connected to the last
node for the loop.

 */

import java.util.HashMap;
import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class Finding_Loop_in_list
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;

        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;

        tail.next = curr;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;

            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);


            System.out.println( countNodesinLoop(head) );
        }
    }
    public static int countNodesinLoop(Node head){
       //creaate two temporary check nodes to find loops
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        int count = 0;
        while(fast!=null&&fast.next!=null){// this approach also can be used to find the middle element of the linked list
            slow = slow.next;//1x speed
            fast = fast.next.next;//2x speed
            if(fast==slow){
                loop = true;
                break;
            }
        }
        if(!loop)return -1;
        //as we got the point where the slow and the fast counter coincides ... now if we start traversing the list from start
        // to end..we will reach back to the position where we started, but we have to remember the position of the start point
        //moving slow pointer to find the distance till it reaches the fast pointer
        while(slow.next!=fast){
            count++;
            slow = slow.next;
        }
        return count+1;

       /*
        HashMap<Node,Integer> map = new HashMap<Node,Integer>();
        Node temp = head;
        int c = 0;
        int res = -1;
        while(temp!=null)
        {
          if(!map.containsKey(temp)){
              map.put(temp,c++);
          }
          if(map.containsKey(temp.next)){
              int a = map.get(temp);
              int b = map.get(temp.next);
              loop = true;
               res = a-b+1;
               break;
          }
          temp = temp.next;
        }

        if(!loop)return -1;
        //finding the length of loop
        return res;
        */

    }
}



import java.util.Random; // Import Random for generating random values

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Method to add two linked lists (improved readability and efficiency)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Create a dummy head for the result
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            current.next = new ListNode(sum % 10); // Create new node with digit value
            carry = sum / 10; // Update carry for next iteration

            current = current.next; // Move current pointer to the newly added node

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next; // Return the actual result (skip dummy head)
    }
}

public class List_Value_Sum {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(); // Create dummy head nodes
        ListNode list2 = new ListNode();
        ListNode tail1 = list1;
        ListNode tail2 = list2;

        int size = 3;
        Random random = new Random(); // Use Random for generating random values

        for (int i = 0; i < size; i++) {
            int val1 = random.nextInt(10); // Generate random values (0-9)
            int val2 = random.nextInt(10);
            ListNode l1 = new ListNode(val1);
            ListNode l2 = new ListNode(val2);

            tail1.next = l1;
            tail1 = l1;

            tail2.next = l2;
            tail2 = l2;
        }

        ListNode result = new ListNode();
        ListNode res = result.addTwoNumbers(list1, list2);
        ListNode temp = list1; // set temp to print list 2
        System.out.println("List 1:");
        while (temp.next != null) { // Print list 1
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.val); // Print last element

        temp = list2; // Reset temp to print list 2
        System.out.println("\nList 2:");
        while (temp.next != null) { // Print list 2
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.val); // Print last element

        temp = res; // Reset temp to print the sum
        System.out.println("\nSum:");
        while (temp.next != null) { // Print the sum
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.val); // Print last element
    }
}

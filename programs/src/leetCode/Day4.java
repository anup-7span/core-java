package leetCode;

/*
 Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:

Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]


*/

class ListNode{
    int val;


    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Day4 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = head;
        while (a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next;
            } else {
                a = a.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
    }
}

package leetCode;

/*
 Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day7 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(11);
        l1.add(5);
        l1.add(22);
        Collections.sort(l1);

        List<Integer> l2=new ArrayList<>();
        l2.add(33);
        l2.add(11);
        l2.add(44);
        Collections.sort(l2);

        l1.addAll(l2);
        Collections.sort(l1);
        System.out.println(l1);
    }
}

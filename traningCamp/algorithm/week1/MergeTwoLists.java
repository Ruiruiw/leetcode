/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

     //最终返回头节点
     //升序数组，取小值
     //需要作的操作：
     //1. 需要一个头节点 head -> list1
     ListNode head = new ListNode(0);
    //  ListNode cur = head;
     ListNode pre = head;
     while(list1 != null && list2 != null){
        if(list2.val <= list1.val){
            // cur = list2;
            pre.next = list2;
            pre = list2;
            list2 = list2.next;
        }else{
            // cur = list1;
            pre.next = list1;
            pre = list1;
            list1 = list1.next;
        }
     }


     pre.next = list2 == null ? list1 : list2;
     return head.next;
         
    }
}

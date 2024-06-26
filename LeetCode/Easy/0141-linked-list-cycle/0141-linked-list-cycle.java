/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode node = head;
        Set<ListNode> set = new HashSet<>();
        while (node.next != null) {
            if (set.contains(node)) {
                return true;
            }
            
            set.add(node);
            node = node.next;
        }
        
        return false;
    }
}
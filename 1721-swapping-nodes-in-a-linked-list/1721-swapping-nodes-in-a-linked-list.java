public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode current = head;

        // First pass to find the length of the list
        while (current != null) {
            length++;
            current = current.next;
        }

        // Find kth from start and kth from end positions
        int fromStart = k;
        int fromEnd = length - k + 1;

        ListNode first = null, second = null;
        current = head;
        int index = 1;

        // Second pass to get references to both nodes
        while (current != null) {
            if (index == fromStart) first = current;
            if (index == fromEnd) second = current;
            current = current.next;
            index++;
        }

        // Swap their values
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        return head;
    }
}

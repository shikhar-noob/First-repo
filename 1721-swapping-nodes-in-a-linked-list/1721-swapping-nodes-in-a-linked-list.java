class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        // Find length
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Find kth node from beginning
        temp = head;
        int i = 1;
        int first = 0;

        while (i < k) {
            temp = temp.next;
            i++;
        }

        first = temp.val;

        // Find kth node from end
        temp = head;
        i = 1;

        while (i < length - k + 1) {
            temp = temp.next;
            i++;
        }

        int second = temp.val;

        // Swap values
        temp = head;
        i = 1;

        while (i < k) {
            temp = temp.next;
            i++;
        }

        temp.val = second;

        temp = head;
        i = 1;

        while (i < length - k + 1) {
            temp = temp.next;
            i++;
        }

        temp.val = first;

        return head;
    }
}
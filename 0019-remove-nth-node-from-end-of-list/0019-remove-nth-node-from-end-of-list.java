class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int stepsFromDummy = size - n;   

        temp = dummy;
        for (int i = 0; i < stepsFromDummy; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;   

        return dummy.next;
    }
}
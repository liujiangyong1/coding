package leetcode100;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2023/1/4 10:40
 * @Description: 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * ②->④->③
 * ⑤->⑥->④
 * _________
 * ⑦->0->⑧
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 */
public class 两数相加 {
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode res = head;
        int nextVal = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + nextVal;
            head.next = new ListNode(val % 10);
            nextVal = val / 10;
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }
        while (l1 != null) {
            int val = l1.val + nextVal;
            head.next = new ListNode(val % 10);
            nextVal = val / 10;
            head = head.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = l2.val + nextVal;
            head.next = new ListNode(val % 10);
            nextVal = val / 10;
            head = head.next;
            l2 = l2.next;
        }
        while (nextVal != 0) {
            head.next = new ListNode(nextVal % 10);
            nextVal = nextVal / 10;
        }
        return res.next;
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode res = head;
        int nextVal = 0;
        while (l1 != null || l2 != null || nextVal != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int val = val1 + val2 + nextVal;
            head.next = new ListNode(val % 10);
            nextVal = val / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            head = head.next;
        }
        return res.next;
    }

}

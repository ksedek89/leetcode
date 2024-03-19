package pl.aswit.leetcode.hard.task25;

public class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    T value;
    ListNode<T> next;
}

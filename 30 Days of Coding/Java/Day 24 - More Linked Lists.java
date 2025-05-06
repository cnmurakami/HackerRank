public static Node removeDuplicates(Node head) {
    //Write your code here
    Node start = head;
    while(head != null && head.next != null) {
        if (head.data == head.next.data) {
            head.next = head.next.next;
        } else {
            head = head.next;
        }
    }
    return start;
}
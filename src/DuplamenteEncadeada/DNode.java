package DuplamenteEncadeada;

public class DNode {
     int element;
     DNode next;
     DNode prev;

    public DNode(int element, DNode prev, DNode next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }


}

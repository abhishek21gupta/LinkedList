public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList (5);
        myLinkedList.makeEmpty();
        myLinkedList.appends(1);
        myLinkedList.appends(2);
        myLinkedList.printAll();
        

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

    }

}
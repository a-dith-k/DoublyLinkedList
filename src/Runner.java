public class Runner {

    public static void main(String[] args) {

        DLinkedList lList = new DLinkedList();

        lList.insert(12);
        lList.insert(19);
        lList.insert(17);
        lList.insert(16);
        lList.insert(14);
        lList.remove(12);
        lList.printList();
        System.out.println();
        lList.printListReverse();

    }
}

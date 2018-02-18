public class Kap16Opgave1 {

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(0,2);
        list.add(1,10);

        set(list,1,5);

        System.out.println(list.get(1));
    }



    // Kapitel 16 opgave 1
    public static  void set(LinkedIntList list, int index, int value) {
        ListNode current = list.nodeAt(index);
        current.data = value;
    }
}

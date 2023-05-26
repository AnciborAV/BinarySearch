public class ArrayApp {
    public static void main(String[] args) {
        int maxSize = 1000;
        OrderedArray arr = new OrderedArray(maxSize);

        arr.insert(5);
        arr.insert(666);
        arr.insert(7);
        arr.insert(28);
        arr.insert(999);
        arr.insert(56);
        arr.insert(880);
        arr.insert(5);
        arr.insert(88);
        arr.insert(99);
        arr.insert(54);
        arr.insert(3);
        arr.insert(6);
        arr.insert(18);
        arr.insert(528);

        int Key = 528;
        if(arr.find(Key) != arr.size())
            System.out.println("Found " + Key);
        else
            System.out.println("Can't find " + Key);

        arr.display();
        
        arr.delete(666);
        arr.delete(999);
        arr.delete(528);

        arr.display();
    }
}
public class OrderedArray {
    private long[] a;
    private int Elems;

    public OrderedArray(int max) {
        a = new long[max];
        Elems = 0;
    }
    public int size() {
        return Elems;
    }
    public int find(long Key) {
        int lowerBound = 0;
        int upperBound = Elems -1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn] == Key)
                return curIn;
            else if(lowerBound > upperBound)
                return Elems;
            else {
                if(a[curIn] < Key)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
    public void insert(long value) {
        int j;
        for(j = 0; j < Elems; j++)
            if(a[j] > value)
                break;
        for(int k = Elems; k > j; k--)
            a[k] = a[k - 1];
        a[j] = value;
        Elems++;
    }
    public boolean delete(long value) {
        int j = find(value);
        if(j == Elems)
            return false;
        else {
            for(int k = j; k < Elems; k++)
                a[k] = a[k + 1];
            Elems--;
            return true;
        }
    }
    public void display() {
        for(int j = 0; j < Elems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }
}


public class recursive {
    int counter = 0;
    int leafCounter = 0;
    int a(int x, int y) {
        counter ++;
        if (x <= 0 || y < 0) {
            leafCounter++;
            return x - y + 2;
        }
        if (x % 2 == 0) {
            return a(x / 2, y) + a(x, y - 1);
        }
        return a(x - 1, y - 2);
    }

    public static void main(String[] args){
        recursive t = new recursive();
        System.out.println(t.a(6,3));
        System.out.println(t.counter + "leafs: "+ t.leafCounter);
    }

}
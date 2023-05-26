
public class Task_Three {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i : x) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
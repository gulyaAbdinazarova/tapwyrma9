public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(method());

    }
    static int method() {
        int sum = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        return sum;
    }

}
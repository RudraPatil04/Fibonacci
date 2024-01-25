public class largest {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 18;
        int num3 = 36;

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }
}

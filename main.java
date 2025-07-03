public class Main {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction s = new Subtraction();

        int a = 10, b = 5;

        int sum = a.add(a, b);
        int diff = s.subtract(a, b);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + diff);
    }
}

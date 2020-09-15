public class Main {
    public static void main(String[] args) {
        long amountInKopecks = 1500000;
        int percent = 5;

        long bonus = amountInKopecks * percent / 100 / 100;
        System.out.println(bonus);
    }
}

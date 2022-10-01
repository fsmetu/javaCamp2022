public class Main {
    public static void main(String[] args) {
        int number = 10;
        int bolen = 2;
        int remainder = number % bolen;

        for(bolen=2;bolen<number;bolen++) {
            if (remainder == 0) {
                System.out.println(number + " Asal değildir");
            } else {
                System.out.println(number + " Asaldır");
            }
        }}}
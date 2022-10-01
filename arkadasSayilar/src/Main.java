public class Main {
    public static void main(String[] args) {
        int number1 = 1184;
        int number2 = 1210;
        int toplam1 = 0;
        int toplam2 = 0;
        int remainder1;
        int remainder2;
        int bolen1 = 1;
        int bolen2 = 1;
        boolean arkadas1 = true;
        boolean arkadas2 = true;

        for (bolen1 = 1; bolen1 < number1; bolen1++) {
            remainder1 = number1 % bolen1;
            if (remainder1 == 0) {
                arkadas1 = true;
                toplam1 = toplam1 + bolen1;
            }
            if (arkadas1 = false) {
                break;
            }
        }
        for (bolen2 = 1; bolen2 < number2; bolen2++) {
            remainder2 = number2 % bolen2;
            if (remainder2 == 0) {
                arkadas2 = true;
                toplam2 = toplam2 + bolen2;
            }
            if (arkadas2 = false) {
                break;
            }
        }
        if (toplam1 == number2) {
            if (toplam2 == number1) {
                System.out.println("Arkadaş Sayılar");
            } }
        else {
                System.out.println("Arkadaş Sayı Değiller");
            }
        }
    }
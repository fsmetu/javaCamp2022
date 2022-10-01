public class Main {
    public static void main(String[] args) {
        int number = 1;
        int bolen = 1;
        int remainder = 2;
        int toplam =0;
        boolean mukemmel=true;
        for(bolen=1;bolen<number;bolen++){
            if(number % bolen == 0) {
                mukemmel = true;
                toplam = toplam + bolen;
            }
            if(mukemmel==false){
                break;
            }}
        if(toplam==number){
            System.out.println("Sayı Mükemmel Sayıdır");
        }
        else{System.out.println("Sayı Mükemmel Sayı Değildir");
            }


    }}
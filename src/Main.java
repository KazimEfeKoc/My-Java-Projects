import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Birim birim2 = new Birim();
    final static double EURO_TO_TL = 44.08;
    final static double DOLLAR_TO_TL = 38.83;
    final static double DOLLAR_TO_EURO = 0.88;
    final static double EURO_TO_DOLLAR = 1.13;
    final static double TL_TO_EURO =0.023;
    final static double TL_TO_DOLLAR =0.026;

    public static void main(String[] args) {
        System.out.println("Welcome to the converter!");
        System.out.print("Birimi secin(T/D/E): ");
        String birim = scanner.nextLine().toUpperCase();

        switch (birim){
            case "T":
                birim2.setCurrency(currency.Turkish_Lira);
                break;
            case "D":
                birim2.setCurrency(currency.Dollar);
                break;
            case "E":
                birim2.setCurrency(currency.Euro);
                break;
            default:
                System.out.println("Düzgün deger gir!");
                break;
        }

        System.out.print("Para miktarini gir: ");
        double miktar = scanner.nextDouble();
        scanner.nextLine();

        birim2.setAmount(miktar);

        System.out.println(miktar + " " + birim2.getCurrency() + "'in var.");

        System.out.println("Hangi birime cevirmek istersin(D,T,E): ");
        String exchange_birim = scanner.nextLine().toUpperCase();

        miktar = exchange(miktar, birim2.getCurrency(), exchange_birim);
        System.out.println(miktar);

        scanner.close();
    }

    public static double exchange(double amount, currency currency, String exchange_birim){

        switch (exchange_birim) {
            case "D":
                if (currency == currency.Turkish_Lira) {
                    amount *= TL_TO_DOLLAR;
                } else if (currency == currency.Euro) {
                    amount *= EURO_TO_DOLLAR;
                } else if (currency == currency.Dollar) {
                    System.out.println("Ayni birim!!!");
                    break;
                }
              break;
            case "E":
                if (currency == currency.Turkish_Lira) {
                    amount *= TL_TO_EURO;
                } else if (currency == currency.Euro) {
                    System.out.println("Ayni birim!!!");
                    break;
                } else if (currency == currency.Dollar) {
                    amount *= DOLLAR_TO_EURO;
                }
                break;
            case "T":
                if (currency == currency.Turkish_Lira) {
                    System.out.println("Ayni birim!!!");
                    break;
                } else if (currency == currency.Euro) {
                    amount *= EURO_TO_TL;
                } else if (currency == currency.Dollar) {
                    amount *= DOLLAR_TO_TL;
                }
                break;
        }
        return amount;
    }

}
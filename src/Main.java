import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Currency Exchange");
        System.out.println();
        System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS");
        System.out.println();
        System.out.println(" 0. EXIT PROGRAM");
        System.out.println();
        System.out.println(" 1. USD to CDN          7. USD to AUD");
        System.out.println(" 2. CDN to USD          8. USD to INR");
        System.out.println(" 3. USD to EURO         9. USD to CNY");
        System.out.println(" 4. EURO to USD        10. USD to TRY");
        System.out.println(" 5. EURO to POUND      11. USD to RUB");
        System.out.println(" 6. POUND to EURO      12. USD to MXN");

        while (true) {
            System.out.println();
            System.out.print("?: ");
            String input = sc.next();


            switch (input) {
                case "0":
                    Thread.sleep(1500);
                    System.out.println("Goodbye");
                    break;

                case "1":
                    System.out.print("Enter USD amount: ");
                    String amount = sc.next();
                    System.out.print(amount + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount) * 1.36213);
                    System.out.print(" CDN\n");
                    break;

                case "2":
                    System.out.print("Enter CDN amount: ");
                    String amount1 = sc.next();
                    System.out.print(amount1 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount1) * 0.733887);
                    System.out.print(" USD\n");
                    break;

                case "3":
                    System.out.print("Enter USD amount: ");
                    String amount2 = sc.next();
                    System.out.print(amount2 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount2) * 1.003603);
                    System.out.print(" EURO\n");
                    break;

                case "4":
                    System.out.print("Enter EURO amount: ");
                    String amount3 = sc.next();
                    System.out.print(amount3 + ".00 EURO " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount3) * 0.996416);
                    System.out.print(" USD\n");
                    break;

                case "5":
                    System.out.print("Enter EURO amount: ");
                    String amount4 = sc.next();
                    System.out.print(amount4 + ".00 EURO " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount4) * 0.857973);
                    System.out.print(" POUNDS\n");
                    break;

                case "6":
                    System.out.print("Enter POUND amount: ");
                    String amount5 = sc.next();
                    System.out.print(amount5 + ".00 EURO " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount5) * 1.16554);
                    System.out.print(" EUROS\n");
                    break;

                case "7":
                    System.out.print("Enter USD amount: ");
                    String amount6 = sc.next();
                    System.out.print(amount6 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount6) * 1.56142 );
                    System.out.print(" AUD\n");
                    break;

                case "8":
                    System.out.print("Enter USD amount: ");
                    String amount7 = sc.next();
                    System.out.print(amount7 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount7) * 82.2910);
                    System.out.print(" INR\n");
                    break;

                case "9":
                    System.out.print("Enter USD amount: ");
                    String amount8 = sc.next();
                    System.out.print(amount8 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount8) * 7.23628);
                    System.out.print(" CNY\n");
                    break;

                case "10":
                    System.out.print("Enter USD amount: ");
                    String amount9 = sc.next();
                    System.out.print(amount9 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount9) * 18.5712);
                    System.out.print(" TRY\n");
                    break;

                case "11":
                    System.out.print("Enter USD amount: ");
                    String amount10 = sc.next();
                    System.out.print(amount10 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount10) * 61.5241);
                    System.out.print(" RUB\n");
                    break;

                case "12":
                    System.out.print("Enter USD amount: ");
                    String amount11 = sc.next();
                    System.out.print(amount11 + ".00 USD " + "-> ");
                    System.out.printf("%4.2f", Integer.parseInt(amount11) * 19.8196);
                    System.out.print(" MXN\n");
                    break;

                default :
                    System.out.println("Invalid entry");
                    break;
            }

        }
    }
}
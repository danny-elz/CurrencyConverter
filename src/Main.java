import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("CHOOSE FROM TE FOLLOWING OPTIONS");
        System.out.println();
        System.out.println(" 0. Exit program");
        System.out.println(" 1. USD to CDN");
        System.out.println(" 2. CDN to USD");
        System.out.println(" 3. USD to EURO");
        System.out.println(" 4. EURO to USD");
        System.out.println(" 5. EURO to POUND");
        System.out.println(" 6. POUND to EURO");

        while (true) {
            System.out.println();
            System.out.print("?: ");
            String input = sc.next();

            if(Integer.parseInt(input) == 0){
                Thread.sleep(1000);
                System.out.println("Goodbye");
                break;
            }
            switch (input) {

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
            }
        }
    }
}
import java.util.Scanner;

public class IpToDecimalConverter {
    public static long ipToDecimal(String ip) {
        String[] octets = ip.split("\\.");
        long decimal = 0;

        for (int i = 0; i < 4; i++) {
            decimal += Integer.parseInt(octets[i]) * Math.pow(256, 3 - i);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IPv4 address: ");
        String ip = scanner.nextLine();
        scanner.close();

        try {
            long decimalValue = ipToDecimal(ip);
            System.out.println("Decimal representation: " + decimalValue);
        } catch (Exception e) {
            System.out.println("Invalid IP address.");
        }
    }
}

package keos_crypto_alg;
import java.util.Scanner;

public class lkollfelkol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;

        // MENU
        System.out.println("--- Keos Crypto Menu ---");
        System.out.println("What do you want?");
        System.out.println("  0 for encryption");
        System.out.println("  1 for decryption");
        System.out.print("Enter choice (0 or 1): ");

        try {
            choix = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("🚨 Invalid input. Please enter 0 or 1.");
            sc.close();
            return;
        }


        // --- Encryption ---
        if (choix == 0) {
            System.out.print("\nEnter string to encrypt: ");
            String inputToEncrypt = sc.nextLine();

            String encrypted = encryption.encrypt(inputToEncrypt);
            System.out.println("\n✅ Encrypted: " + encrypted);

        } else if (choix == 1) {

            // --- Decryption ---
            System.out.print("\nEnter string to decrypt: ");
            String inputToDecrypt = sc.nextLine();
            String decrypted = decryption.decrypt(inputToDecrypt);
            System.out.println("\n🔄 Decrypted: " + decrypted);

        } else {
            System.out.println("\n🚫 Invalid choice. Please run the program again and enter 0 or 1.");
        }

        sc.close();
    }
}
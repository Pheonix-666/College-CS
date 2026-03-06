import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plain text: ");
        String plainText = scanner.nextLine();

        System.out.print("Enter shift key (e.g., 3): ");
        int shift = scanner.nextInt();

        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }

            cipherText += ch;
        }

        System.out.println("Encrypted text (Cipher): " + cipherText);

        scanner.close();
    }
}

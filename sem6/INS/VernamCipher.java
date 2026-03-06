public class VernamCipherMain {
    public static void main(String[] args) {

        String plaintext = "HELLO";
        String key = "MONEY";

        StringBuilder ciphertext = new StringBuilder();

        System.out.println("Plaintext:  " + plaintext);
        System.out.println("Key:        " + key);

        for (int i = 0; i < plaintext.length(); i++) {

            int pNum = plaintext.charAt(i) - 'A';

            int kNum = key.charAt(i) - 'A';

            int cNum = (pNum + kNum) % 26;

            char cChar = (char) (cNum + 'A');

            ciphertext.append(cChar);
        }

       
        System.out.println("Ciphertext: " + ciphertext.toString());
        // Output: TSYPM
    }
}



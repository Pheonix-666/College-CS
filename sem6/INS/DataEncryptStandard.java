import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class SimpleAES {
    public static void main(String[] args) throws Exception {

        String plainText = "This is a secret AES message.";

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey aesKey = keyGen.generateKey();

        Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

        aesCipher.init(Cipher.ENCRYPT_MODE, aesKey);
        byte[] plainTextBytes = plainText.getBytes();
        byte[] cipherTextBytes = aesCipher.doFinal(plainTextBytes);
        String cipherText = Base64.getEncoder().encodeToString(cipherTextBytes);

        System.out.println("Plaintext:  " + plainText);
        System.out.println("Encrypted:  " + cipherText);

        aesCipher.init(Cipher.DECRYPT_MODE, aesKey);
        byte[] bytesToDecrypt = Base64.getDecoder().decode(cipherText);
        byte[] decryptedBytes = aesCipher.doFinal(bytesToDecrypt);
        String decryptedText = new String(decryptedBytes);

        System.out.println("Decrypted:  " + decryptedText);
    }
}


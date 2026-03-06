import javax.crypto.Cipher; 
import javax.crypto.KeyGenerator; 
import javax.crypto.SecretKey; 
// Rivest Cipher
public class RC4Example  
{ 
    public static void main(String[] args) throws Exception  
{ 
        
         KeyGenerator keyGen = KeyGenerator.getInstance("RC4"); 
         keyGen.init(128); 
         SecretKey secretKey = keyGen.generateKey(); 
 
         Cipher rc4Cipher = Cipher.getInstance("RC4"); 
 
         String plaintext = "This is a secret message."; 
         byte[] plainBytes = plaintext.getBytes(); 
 
         rc4Cipher.init(Cipher.ENCRYPT_MODE, secretKey); 
         byte[] encrypted = rc4Cipher.doFinal(plainBytes); 
         System.out.println("Encrypted: " + bytesToHex(encrypted)); 
 
         rc4Cipher.init(Cipher.DECRYPT_MODE, secretKey); 
         byte[] decrypted = rc4Cipher.doFinal(encrypted); 
         System.out.println("Decrypted: " + new String(decrypted)); 
     } 
 
     private static String bytesToHex(byte[] bytes)  
{ 
          StringBuilder sb = new StringBuilder(); 
          for (byte b : bytes) { 
              sb.append(String.format("%02X", b)); 
          } 
         return sb.toString(); 
     } 
}
import java.util.*; 
public class MonoalphabeticCipher { 
public static void main(String[] args) { 
String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
String key = "QWERTYUIOPASDFGHJKLZXCVBNM"; 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter plaintext (UPPERCASE): "); 
String plaintext = sc.nextLine(); 
StringBuilder ciphertext = new StringBuilder(); 
for (int i = 0; i < plaintext.length(); i++)  
{ 
char ch = plaintext.charAt(i); 
int index = alphabet.indexOf(ch); 
if (index != -1)  
{ 
ciphertext.append(key.charAt(index)); 
}//if  
else  
{ 
ciphertext.append(ch);//Non-alphabetic-characters-remain-same 
}//else 
}//for 
System.out.println("Ciphertext: " + ciphertext.toString()); 
} 
} 

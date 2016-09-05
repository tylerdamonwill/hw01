import java.util.Scanner;

public class VigenereCipher{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("This program encrypts and decrypts messages using the Vigenere Cipher.\n"
				+ "Would you like to encode or decode a message?");

		String response = in.nextLine();

		if(response.equals("encode")){
			System.out.println("Enter the string to encode:");
			response = in.nextLine();
			System.out.println("Enter the key:");
			String key = in.nextLine();
			encodeMessage(response, key);
		}
		else if (response.equals("decode")){
			System.out.println("Enter the string to decode:");
			response = in.nextLine();
			System.out.println("Enter the key:");
			String key = in.nextLine();
			decodeMessage(response, key);
		}
		else{
			System.out.println("Valid options are 'encode' or 'decode'");
			System.exit(0);
		}
		in.close();
	}

	public static void encodeMessage (String message, String key){
		StringBuilder expandedKey = new StringBuilder();
		StringBuilder encryptedKey = new StringBuilder();
		char letter;
		for(int n = 0; n < message.length(); n++){
			letter = key.charAt(n % key.length());
			expandedKey.insert(n, letter);
		}
		for(int i = 0; i < message.length(); i++){
			char messagePlace = message.charAt(i);
			char keyPlace = expandedKey.charAt(i);
			int num = (int) messagePlace;
			int num2 = (int) keyPlace;
			char encrypChar = (char) ((((num - 97) + (num2 - 97)) % 26) + 97);
			encryptedKey.insert(i, encrypChar);
		}
		System.out.println(encryptedKey);
	}

	public static void decodeMessage (String message, String key){
		StringBuilder expandedKey = new StringBuilder();
		StringBuilder encryptedKey = new StringBuilder();
		char letter;
		for(int n = 0; n < message.length(); n++){
			letter = key.charAt(n % key.length());
			expandedKey.insert(n, letter);
		}
		for(int i = 0; i < message.length(); i++){
			char messagePlace = message.charAt(i);
			char keyPlace = expandedKey.charAt(i);
			int num = (int) messagePlace;
			int num2 = (int) keyPlace;
			char encrypChar = (char) ((((num - 71) - (num2 - 97)) % 26) + 97);
			encryptedKey.insert(i, encrypChar);
		}
		System.out.println(encryptedKey);
	}
}

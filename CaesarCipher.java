import java.util.Scanner;

public class CaesarCipher{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("This program encrypts and decrypts messages using the Caeser Cipher.\n"
				+ "Would you like to encode or decode a message?");

		String response = in.nextLine();

		if(response.equals("encode")){
			System.out.println("Enter the string to encode:");
			response = in.nextLine();
			for(int n = 0; n < 26; n++){
				System.out.print("n = " + n + ": ");
				for(int i = 0; i < response.length(); i++){
					char letter = response.charAt(i);
					int num = (int) letter;
					num = ((((num + n) - 97) % 26) + 97);
					if (i < (response.length() - 1)){
						System.out.print((char)num);}
					else {System.out.println((char)num);}	
				}
			}
		}
		/*for(n = 0; n < 26; n++){

            }*/
		else if (response.equals("decode")){

		}
		else{
			System.out.println("Valid options are 'encode' or 'decode'");
			System.exit(0);
		}
	}
}
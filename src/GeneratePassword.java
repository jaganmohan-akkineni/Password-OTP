import java.util.*;

public class GeneratePassword {
	
	public static StringBuilder generatePassword(int len) {

		StringBuilder lower =  new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		StringBuilder upper = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		StringBuilder numbers = new StringBuilder("0123456789");
		StringBuilder symbols = new StringBuilder("!@#$%^&*");
		
		StringBuilder values = new StringBuilder();
		values.append(lower);
		values.append(upper);
		values.append(numbers);
		values.append(symbols);
		
		Random rand = new Random();
		
		StringBuilder pass = new StringBuilder();
		
		for(int i=0; i<len; i++) {
			pass.append(values.charAt(rand.nextInt(values.length())));
		}
		
		return pass;
	}
	
	public static void main(String[] args) {
		System.out.println(generatePassword(10));
	}
	
}

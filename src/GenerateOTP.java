import java.util.*;

public class GenerateOTP {
	
	public static StringBuilder generateOTP(int len) {
		String numbers = "0123456789";
		int n = numbers.length();
		
		Random rand = new Random();
		
		StringBuilder OTP = new StringBuilder();
		
		for(int i=0; i<len; i++) {
			OTP.append(numbers.charAt(rand.nextInt(n)));
		}
		
		return OTP;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateOTP(5));
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ex_6_1();		//Complete ~~ Switch output expected and actual statement for test.java to fix
		//ex_6_2();		//Complete
		//ex_6_3();		//Complete
		//ex_6_18();	//Complete
		//ex_6_31();	//Complete
		//ex_6_36();	//Complete
		//System.out.print(getPentagonalNumber(1));
	}
	
	
	
	// ################################################
	//				EXERCISE 6.1
	// ################################################
	static void ex_6_1() {
		
		for (int i = 1; i < 101; i++){
			System.out.printf("%s	", getPentagonalNumber(i));
			
			if (i % 10 == 0)
				System.out.println();
			} 
		}

	
	
	public static int getPentagonalNumber(int n){
		return (n * (3 * n - 1)) / 2;
		}

	
	
	// ################################################
	//				EXERCISE 6.2
	// ################################################
	static void ex_6_2() {
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		
		System.out.println("The sum: "+sumDigits(in));
	}

	
	
	public static int sumDigits(int n){
		
        int temp = n; //Temp info
        int sum = 0; //Total sum
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10; 
        }

        return sum;
	}
	
	
	
	// ################################################
	//				EXERCISE 6.3
	// ################################################
	static void ex_6_3() {
		Scanner input = new Scanner(System.in);
		
		int user = input.nextInt();
		System.out.println("Is "+user+" a palindrome? "+ isPalindrome(user));
	}

	public static int reverse(int number){
		int reversed = 0;
		int amount = 0;
		while(number != 0) {
			reversed = reversed * 10;
			int temp = number % 10;
			number = number / 10;
			reversed += temp;
			}
			
		return reversed;
		}
	
	public static boolean isPalindrome(int number) {
		if(number == reverse(number)){
			return true;
		}
		else {
			return false;
		}
		
	}
		
	
	
	// ################################################
	//				EXERCISE 6.18
	// ################################################
	static void ex_6_18() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine(); //Comment should be removed in finished
		
		if (isValidPassword(password)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	public static boolean isValidPassword(String password) {
		int numberCount = 0;
		int alphaCount = 0;
		boolean correctChar = true; 
		
		for (int i = 0, len = password.length(); i < len; i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberCount++;
			}
			if (Character.isAlphabetic(password.charAt(i))) {
				alphaCount++;
			}
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				correctChar = false;
				break;
			}
		}
		int total = alphaCount + numberCount;
		if (total >= 8 && numberCount >= 2 && correctChar == true) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
	
	
	// ################################################
	//				EXERCISE 6.31
	// ################################################
	static void ex_6_31() {
		//System.out.println(isValid(1234));
		System.out.println("GetPrefix Method: "+getPrefix(1234, 8));

	}
	
	public static boolean isValid(long number) {
		boolean valid = (getSize(number) >= 13 && getSize(number) <= 16) &&
				((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) &&
				(prefixMatched(number, 4) || prefixMatched(number, 5) ||
				prefixMatched(number, 37) || prefixMatched(number, 6));
		
		return valid;
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		long temp = 0;
		
		number = number / 10;
		while (number != 0) {
			temp = (number % 10)*2;
			sum += getDigit((int)temp);
			number = number / 100;
		}
		return sum;
	}
	
	public static int getDigit(int number) {
		int digitSum = 0;
		if(number >= 10) {
			digitSum += number % 10;
			digitSum += number / 10;
			return digitSum;
		}
		else {
			return number;
		}
	}
	
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		long temp = 0;
		
		while (number != 0) {
			temp = number % 10;
			sum += temp;
			number = number / 100;
		}
		return sum;
		
	}
	
	public static boolean prefixMatched(long number, int d) { //prefixMatched(371234, 37)
		return getPrefix(number, getSize(d)) == d; //getPrefix(371234, 2) == 2? 
	}
	
	public static int getSize(long d) {
		int count = 0;
		while(d != 0) {
			d = d / 10;
			count++;
		}
		return count;
	}
	
	public static long getPrefix(long number, int k) {
		
	
		int size = getSize(number); //returns 4
		double multiply = Math.pow(10, size-k); //10^3
		long actual = (long)(number / multiply); 
		
		System.out.println("Number: "+ number);
		if(size > k) {
			return actual;
		}
		else {
			return number;
		}
		
	}
	
	
	
	// ################################################
	//				EXERCISE 6.36
	// ################################################
	static void ex_6_36() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides of a regular polygon: ");
		int numOfSides = input.nextInt();
		System.out.println("Enter the length of the sides: ");
		double sizeOfSides = input.nextDouble();

		System.out.println("The area of this polygon is: " + area(numOfSides, sizeOfSides));
	}
	
	public static double area(int n, double side) {
		
		double area = (n * Math.pow(side, 2))/ (4 * Math.tan(Math.PI / n));	
		return area;
	}
}
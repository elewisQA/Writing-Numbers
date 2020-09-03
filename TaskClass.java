public class TaskClass {
	// Convert Method
	//Turns number into its text form
	public static void convert(int a) {
		String out = "";
		if (a < 0) {
			out = "No-negative values allowed.";
		} else {
			if (a == 0) {
				out = "zero";
			} else if (a <= 9) {
				out = positionOne(a);
			} else if (a <= 99) {
				out = doubleDigit(a);
			} else if (a <= 999) {
				out = tripleDigit(a);
			} else if (a <= 9999) {
				out = quadrupleDigit(a);
			} else {
				out = "Numbers over 9999 are stupid.";
			}
		}
		System.out.println(out);
	}
	
	// Digit Length Methods
	private static String doubleDigit(int a) {
		String toReturn;
		if (a/10 == 0) {
			toReturn = positionOne(a%10);
		} else if(a <= 19) {
			toReturn = teens(a);
		} else {
			toReturn = positionTwo(a);
			toReturn += positionOne(a%10);
		}
		return toReturn;
	}
	
	private static String tripleDigit(int a) {
		String toReturn = "";
		if (positionOne(a/100) != "") {
			toReturn += positionOne(a/100) + " hundred and ";
		}
		toReturn += doubleDigit(a%100);
		return toReturn;
	}
	
	private static String quadrupleDigit(int a) {
		String toReturn = positionOne(a/1000) + " thousand ";
		toReturn += tripleDigit(a%1000);
		return toReturn;
	}

	// Switch Case Methods
	private static String teens(int a) {
		switch(a%10) {
			case 0: return("ten");
			case 1: return("eleven");
			case 2: return("twelve");
			case 3: return("thirteen");
			case 4: return("fourteen");
			case 5: return("fifteen");
			case 6: return("sixteen");
			case 7: return("seventeen");
			case 8: return("eighteen");
			case 9: return("ninteen");
			default: return("UNKNOWN");
		}
		
	}
	
	private static String positionTwo(int a) {
		switch(a/10) {
			case 0: return("");
			case 2:	return("twenty ");
			case 3: return("thirty ");
			case 4: return("fourty ");
			case 5: return("fifty ");
			case 6: return("sixty "); 
			case 7: return("seventy ");
			case 8: return("eighty ");
			case 9: return("ninty ");
			default: return("UNKNOWN");
		}
	}
	
	private static String positionOne(int a) {
		switch(a) {
			case 0: return("");
			case 1: return("one");
			case 2:	return("two");
			case 3: return("three");
			case 4: return("four");
			case 5: return("five");
			case 6: return("six"); 
			case 7: return("seven");
			case 8: return("eight");
			case 9: return("nine");
			default: return("UNKNOWN");
		}
	}
}

package kaya.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers.trim().length()<=0)
			return 0;

		int result = 0;
		List<Integer> numberList = getNumberListFromString(numbers);
		for(Integer number: numberList) {
			result += number;
		}
		return result;
	}
	
	public List<Integer> getNumberListFromString(String numbers) {
		
		String delimeter = ",|\n";
		if(numbers.startsWith("//")) {
			delimeter = numbers.substring(2, numbers.indexOf("\n"));
			numbers = numbers.substring(numbers.indexOf("\n") + 1);
		}
		
		String[] numberArray = numbers.split(delimeter);
		List<Integer> numberList = new ArrayList();
		String negativeExceptionString = "NEGATIVES NOT ALLOWED - ";
		for(String number: numberArray) {
			
			numberList.add(Integer.parseInt(number));
		}
		return numberList;
	}

}

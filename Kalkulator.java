import java.util.*;

public class Kalkulator {
	public static void main(String[] args) {
	System.out.println("Kalkulator");
	System.out.println("Masukkan angka pertama: ");
	// input angka
	Scanner numberInput = new Scanner(System.in);
	double number1 = numberInput.nextDouble();
	
	System.out.println("Masukkan operator aritmetika (+,-,/,*,%)");
	Scanner operatorInput = new Scanner(System.in);
	String operator = operatorInput.nextLine();

	System.out.println("Masukkan angka kedua");
	double number2 = numberInput.nextDouble();

	double calculationResult;

		switch (operator) {
			case "+" :
				calculationResult = number1 + number2;
				System.out.println("Hasil Perhitungan = "+calculationResult);
				break;
			case "-":
				calculationResult = number1 - number2;
				System.out.println("Hasil Perhitungan = "+calculationResult);
				break;
			case "/":
				calculationResult = number1 / number2;
				System.out.println("Hasil Perhitungan = "+calculationResult);
				break;
			case "*":
				calculationResult = number1	* number2;
				System.out.println("Hasil Perhitungan = "+calculationResult);
				break;
			case "%":
				calculationResult = number1 % number2;
				System.out.println("Hasil Perhitungan = "+calculationResult);
				break;	
			default :
				System.out.println("Bukan operator aritmatika");			
		}
	}
}

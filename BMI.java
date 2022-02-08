import java.util.Scanner;
public abstract class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		weight = weight * 0.45359237;
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		height = height * 0.0254;
		
		double BMI = (weight / (height * height));
		System.out.println("BMI is " + BMI);
		
		String interpretation = "";
		if(BMI < 18.5) {
			interpretation = "Underweight";
		} else if (BMI < 25) {
			interpretation = "Normal";
		} else if (BMI < 30) {
			interpretation = "Overweight";
		} else {
			interpretation = "Obese";
		}
		
		System.out.println(interpretation);
	}

}

package Main;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.*;

public class Main {
	public static void main(String[] args) {// main process }

		Scanner enter = new Scanner(System.in);

		System.out.println("Enter number of years you intend to work:");
		int Yearswork = enter.nextInt();

		System.out.println("Enter annual return for your working year:");
		double workingReturn = enter.nextDouble();

		System.out.println("Enter the number of years you plan to be retired:");
		double Yearsretired = enter.nextDouble();

		System.out.println("Enter annual return for your retired years:");
		double RetiredReturn = enter.nextDouble();

		System.out.println("Enter your disered monthly income:");
		double MonthlyInc = enter.nextDouble();

		System.out.println("Enter the amount of money, you shall recieve from your social security:");
		double SSinc = enter.nextDouble();

		enter.close(); // terminates scanner inputs

		double r = RetiredReturn / 1200;
		double n = Yearsretired * 12;
		double y = MonthlyInc - SSinc;
		double f = 0;
		boolean t = false;

		double PayAmount = -1 * FinanceLib.pv(r, n, y, f, t);

		System.out.print("You need to save $");
		System.out.printf("%.2f", PayAmount);
		System.out.println("to retire on time");

		r = workingReturn / 1200;
		n = Yearswork * 12;
		double p = 0;
		f = PayAmount;

		double Income = FinanceLib.pmt(r, n, p, f, t);
		System.out.print("Your monthly payment will be $");
		System.out.printf("%.2f", -1 * Income);

	}
}

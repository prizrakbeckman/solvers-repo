package ma.prizrak.calculator.main;

import ma.prizrak.calculator.interfaces.ICalculator;
import ma.prizrak.calculator.model.OperacjaEnum;

public class CalculatorMain {
	private static final String BLANK = " ";
	private static ICalculator<String, Float> iCalculator;

	public static void main(String[] args) {
		String op = "10 * 4";
		String[] vals = op.split(BLANK);
		iCalculator = (op1, op2, op3) -> OperacjaEnum.valueFromOp(op1).getOperation().apply(op2, op3);
		
		System.out.println("calculator the old fashion way " + iCalculator.calculate(vals[1], Float.parseFloat(vals[0]), Float.parseFloat(vals[2])));
	}

}

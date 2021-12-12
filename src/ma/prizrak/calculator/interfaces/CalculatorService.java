package ma.prizrak.calculator.interfaces;

import ma.prizrak.calculator.model.OperacjaEnum;

public class CalculatorService{
		
	private static ICalculator<String, Float> provideCalculator(){
		return 	(op1, op2, op3) -> OperacjaEnum.valueFromOp(op1).getOperation().apply(op2, op3);

	}
	
}

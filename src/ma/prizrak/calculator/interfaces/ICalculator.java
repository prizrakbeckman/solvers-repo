package ma.prizrak.calculator.interfaces;

@FunctionalInterface
public interface ICalculator<R,T> {
	
	T calculate(R op, T operand1, T operand2);
	
}

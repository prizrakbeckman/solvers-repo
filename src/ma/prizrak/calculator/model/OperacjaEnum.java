package ma.prizrak.calculator.model;

import java.util.function.BiFunction;

public enum OperacjaEnum {
	
	DODAJ("+", (op1,op2) -> op1+op2),
	ODEJMIJ("-", (op1,op2) -> op1-op2),
	ZWIELOKROTNIAC("*", (op1,op2) -> op1*op2),
	DZIELIC("+", (op1,op2) -> op1%op2);
	
	
	private String op;
	private BiFunction<Float, Float, Float> operation;

	private OperacjaEnum(String op, BiFunction<Float, Float, Float> operation) {
			this.op = op;
			this.operation = operation;
	}
	
	public static OperacjaEnum valueFromOp(String op) {
	    for (OperacjaEnum oe : values()) {
	        if (op.contains(oe.op)) {
	            return oe;
	        }
	    }
	    return null;
	}
	
	public BiFunction<Float, Float, Float> getOperation(){
		return this.operation;
	}
}

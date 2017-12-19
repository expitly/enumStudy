package org.jjy.study;

public enum Operation {
	PLUS("+"){
		double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-"){
		double apply(double x, double y) {
			return x-y;
		}
	},
	TIMES("*"){
		double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/"){
		double apply(double x, double y) {
			return x/y;
		}
	};
	
	private final String symbol;
	
	private Operation(String symbol) {
		this.symbol = symbol;
	}
	
	abstract double apply(double x, double y);

	@Override
	public String toString() {
		return symbol;
	}
}

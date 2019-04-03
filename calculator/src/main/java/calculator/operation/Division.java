package calculator.operation;

public class Division extends Operation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "division";
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "/";
	}

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return a / b;
	}

}

package interest_calc;


public class InterestCalculation implements InterestCal{
	double rate,amount,time;
	InterestCalculation(double rate,double amnt,double t)
	{
		this.rate=rate;
		amount=amnt;
		time=t;
	}
	public double simpleInterest()
	{
		double SI;
		SI=(amount * time * rate)/100;
		return SI;
	}
	public double compoundInterest()
	{
		double CI;
		CI=amount * Math.pow(1.0+rate/100.0,time) - amount;
		return CI;
	}
}

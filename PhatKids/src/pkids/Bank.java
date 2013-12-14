package pkids;

public class Bank {
	
	private int bankValue = 0;
	
	public Bank(int bankValue) {
		setBankValue(bankValue);
	}

	
	public void setBankValue(int bv)
	{
		bankValue = bv;
	}
	
	public int getBankValue()
	{
		return bankValue;
	}
	
	public void changeBankValue(int dv)
	{
		bankValue += dv;
	}
}

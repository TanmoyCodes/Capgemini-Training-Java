/* BANK
 * Account(get)
 * AccountHolderName(get/set)
 * IFSC(get)
 * Balance(get/set)
 * MICR(get)
 */

class Account
{
	private int accNo = 1000;
	
	public int getAcc()
	{
		return accNo;
	}
}

class AccoundHolderName
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class IFSC
{
	private String IFSC = "UTIB0000504";
	
	public String getIfsc()
	{
		return IFSC;
	}
}

class Balance
{
	private int bal;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
}

class MICR
{
	private String micr = "100000089";
	
	public String getMicr()
	{
		return micr;
	}
}


public class Bank {

	public static void main(String[] args) {
		
		Account acc = new Account();
		AccoundHolderName holder = new AccoundHolderName();
		IFSC ifsc = new IFSC();
		Balance bal = new Balance();
		MICR micr = new MICR();
		
		holder.setName("Ansh");
		bal.setBal(50000);
		
		System.out.println("Accound number: " + acc.getAcc());
		System.out.println("Account holder name: " + holder.getName());
		System.out.println("Bank IFSC: " + ifsc.getIfsc());
		System.out.println("Your balance: " + bal.getBal());
		System.out.println("Bank MICR: " + micr.getMicr());
	}
}
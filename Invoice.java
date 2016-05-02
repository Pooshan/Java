// (A)

public class Invoice

{
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;

	//Constructor
	public Invoice(int newInvoiceNumber, double
		newBalanceDue, int newMonth, int newDay, int newYear)
	{
		if(newInvoiceNumber < 1000)
			invoiceNumber = 0;
		else
			invoiceNumber = newInvoiceNumber;

		if(newMonth < 1 || newMonth > 12)
			month = 0;
		else
			month = newMonth;

		if(newDay <1 || newDay > 31)
			day = 0;
		else
			day = newDay;

		if (newYear < 2011 || newYear > 2017)
			year = 0;
		else
			year = newYear;

		balanceDue = newBalanceDue;
	}

	public void display()
	{
		System.out.println("Invoice number: " + invoiceNumber);
		System.out.println("Balance due: " + balanceDue);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Year: " + year);
		System.out.println();

	}
}

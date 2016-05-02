
public class Invoice2{
	//fields
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;

	//parameterized constructor
	public Invoice2(int newInvoiceNumber, double newBalanceDue, int newMonth, int newDay, int newYear)
	{
		if(newInvoiceNumber < 1000)
			invoiceNumber = 0;
		else
			invoiceNumber = newInvoiceNumber;

		if(newMonth < 1 || newMonth >12)
		{
			month = 0;
			day = 0;
		}
		else
		{
			month = newMonth;

			switch(newMonth)
			{
				case 2:
					if(newDay <1 || newDay > 28)
						day = 28;
					else
						day = newDay;
					break;
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12:
					if(newDay < 1 || newDay > 31)
						day = 31;
					else
						day = newDay;
					break;
					default:
						if(newDay <1 || newDay > 30)
							day = newDay;
						else
							day = newDay;
					}
				}

				if(newYear <2011 || newYear > 2017)
					newYear = 0;
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

public class TestInvoice{
	public static void main(String[] args) {

	Invoice invoice1 = new Invoice(12000, 5000, 10, 22, 2012);
	Invoice invoice2 = new Invoice(900, 12000, 11, 30, 2015);
	Invoice invoice3 = new Invoice(15000, 7000, 20, 15, 2011);
	Invoice invoice4 = new Invoice(2000, 9000, 9, 33, 2014);
	Invoice invoice5 = new Invoice(12000, 5000, 2, 3, 2020);

	invoice1.display();
	invoice2.display();
	invoice3.display();
	invoice4.display();
	invoice5.display();

	}
}

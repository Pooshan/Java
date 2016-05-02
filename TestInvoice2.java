
public class TestInvoice2

{
	public static void main(String[] args) {

	Invoice2 invoice1 = new Invoice2(12000, 5000, 10, 22, 2012);
	Invoice2 invoice2 = new Invoice2(12000, 5000, 2, 30, 2015);
	Invoice2 invoice3 = new Invoice2(12000, 5000, 6, 31, 2011);
	Invoice2 invoice4 = new Invoice2(12000, 5000, 12, 33, 2014);
	Invoice2 invoice5 = new Invoice2(12000, 5000, 18, 3, 2013);

	invoice1.display();
	invoice2.display();
	invoice3.display();
	invoice4.display();
	invoice5.display();

	}
}

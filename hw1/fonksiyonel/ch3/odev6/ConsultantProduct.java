package hw1.fonksiyonel.ch3.odev6;

public class ConsultantProduct extends Product implements ISellableProduct {
	private String consultantName;
	private int consultantId;

	public ConsultantProduct(String description, String name, int id, int stock, double price, double tax,
			String consultantName, int consultantId) {
		super(description, name, id, stock, price, tax);
		this.consultantName = consultantName;
		this.consultantId = consultantId;
	}

	public String getConsultantName() {
		return consultantName;
	}

	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}

	public int getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}

	@Override
	public void purchase() {
		System.out.println(getConsultantId() + "," + getConsultantName() + " selected for consultant.");

	}

}

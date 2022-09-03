package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
   
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactueDate;
	
	public UsedProduct(String name, Double price, Date manufactueDate) {
		super(name, price);
		this.manufactueDate = manufactueDate;
	}
	
	  
		public Date getManufactueDate() {
		return manufactueDate;
	}

	public void setManufactueDate(Date manufactueDate) {
		this.manufactueDate = manufactueDate;
	}

	@Override
		public String priceTag() {
		return getName() + "(used) $ " + String.format("%.2f", getPrice()) +
		 "(Manufacture date: " + sdf.format(manufactueDate) + ")";
	}
}

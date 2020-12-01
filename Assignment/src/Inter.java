import java.util.Date;

public class Inter extends Tour {
	private double aviationTax;
	private double entryFee;
	public Inter(String code, String title, double price, boolean transport, Date startDate, Date endDay,
	double aviationTax, double entryFee) {
	super(code, title, price, transport, startDate, endDay);
		this.aviationTax = aviationTax;
		this.entryFee = entryFee;
	}

        public Inter() {
        }

	public double getAviationTax() {
		return aviationTax;
	}

	public void setAviationTax(double aviationTax) {
		this.aviationTax = aviationTax;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}
    
	@Override
	public double surCharge() {
		return aviationTax + entryFee;
	}

	@Override
	public double tourCharge() {
		return surCharge() + price;
	}

	@Override
	public String toString() {
		return "Inter [" + super.toString() + ", aviationTax=" + aviationTax + ", entryFee=" + entryFee + "]";
	}

}

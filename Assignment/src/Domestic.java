import java.util.Date;

public class Domestic extends Tour {
	private double tourGuideTip;

	public Domestic(){
	}

	public Domestic(String code, String title, double price, boolean transport, Date startDate, Date endDay,
	double tourGuideTip) {
		super(code, title, price, transport, startDate, endDay);
		this.tourGuideTip = tourGuideTip;
	}

	public double getTourGuideTip() {
		return tourGuideTip;
	}

	public void setTourGuideTip(double tourGuideTip) {
		this.tourGuideTip = tourGuideTip;
	}

	public long NumberOfDates(){
		return (this.endDay.getTime()- this.startDate.getTime())/1000/60/60/24;
	}

	@Override
	public double surCharge() {
		return tourGuideTip * NumberOfDates();
	}

	@Override
	public double tourCharge() {
		return surCharge() + price;
	}

	@Override
	public String toString() {
		return "Domestic [" + super.toString() + ", tourGuideTip=" + tourGuideTip + "]";
	}

}


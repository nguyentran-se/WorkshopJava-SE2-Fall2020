
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Tour implements ITour {

    protected String code, title;
    protected double price;
    protected boolean transport;
    protected Date startDate;
    protected Date endDay;

    public Tour() {
    }

    public Tour(String code, String title, double price, boolean transport, Date startDate, Date endDay) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDate = startDate;
        this.endDay = endDay;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }    

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        return "code=" + code + ", title=" + title + ", price=" + price + ", transport=" + transport
                + ", startDate=" + df.format(startDate) + ", endDay=" + df.format(endDay);
    }

    public abstract double surCharge();
}

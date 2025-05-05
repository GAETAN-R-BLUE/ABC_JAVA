package CAR;

public class Car {
    private String Make;
    private String Model;
    private Integer year;
    private Double Price;

    public Car(String make, String model, Integer year, Double price) {
        Make = make;
        Model = model;
        this.year = year;
        Price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return
                "Make:" + Make + '\n' +
                "Model:'" + Model + '\n' +
                "year: " + year + '\n' +
                "Price: " + Price;
    }
}

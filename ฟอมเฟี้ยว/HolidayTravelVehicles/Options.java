public class Options {
    public int option_code;
    public String description;
    public int price;

    public Options(int newOptions_code, String newDescription, int newPrice) {
        this.option_code = newOptions_code;
        this.description = newDescription;
        this.price = newPrice;
    }
    public int getOptions_code() {
        return this.option_code;
    }
    public String getDescription() {
        return this.description;
    }
    public int getPrice() {
        return this.price;
    }
}

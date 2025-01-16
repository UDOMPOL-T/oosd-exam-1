public abstract class TaxCalculator
{
    private int price_to_pay;
    
    protected abstract void calculateTax();

    public int getPrice_to_pay() {
        return price_to_pay;
    }
    public void setPrice_to_pay(int price_to_pay) {
        this.price_to_pay = price_to_pay;
    }
}
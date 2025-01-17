public abstract class TaxCalculator
{
    private int Excluding_Value_Added_Tax;
    
    protected abstract double calculateTax();

    public void setExcluding_Value_Added_Tax(int price_to_pay) {
        this.Excluding_Value_Added_Tax = price_to_pay;
    }

    public int getExcluding_Value_Added_Tax() {
        return Excluding_Value_Added_Tax;
    }
}
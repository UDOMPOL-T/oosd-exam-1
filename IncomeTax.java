public class IncomeTax extends TaxCalculator
{
    public IncomeTax(int i) {
        super.setExcluding_Value_Added_Tax(i);
    }

    @Override
    protected double calculateTax()
    {
        return (double) this.getExcluding_Value_Added_Tax() * (10 / 100.0);
    }
}

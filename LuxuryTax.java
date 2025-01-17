public class LuxuryTax extends TaxCalculator
{
    public LuxuryTax(int i) {
        super.setExcluding_Value_Added_Tax(i);
    }

    @Override
    protected double calculateTax()
    {
        return (double) this.getExcluding_Value_Added_Tax() * (15 / 100.0);
    }

}
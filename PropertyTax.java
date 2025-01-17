public class PropertyTax extends TaxCalculator
{
    public PropertyTax(int i) {
        super.setExcluding_Value_Added_Tax(i);
    }

    @Override
    protected double calculateTax()
    {
        return (double) this.getExcluding_Value_Added_Tax() * (20 / 100.0);
    }
}




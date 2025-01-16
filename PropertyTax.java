public class PropertyTax extends TaxCalculator
{
    public PropertyTax(int i) {
        super.setPrice_to_pay(i);
    }

    @Override
    protected void calculateTax()
    {
        System.out.println(5);
    }
}




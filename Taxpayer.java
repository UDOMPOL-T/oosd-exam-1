import java.util.ArrayList;

public class Taxpayer {

    private String firstName;
    private String lastName;
    private ArrayList<TaxCalculator> taxes;

    public Taxpayer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxes = new ArrayList<TaxCalculator>(0);
    }

    void addTax(LuxuryTax luxuryTax) {
    
        this.taxes.add(luxuryTax);
    }

    void addTax(IncomeTax incomeTax) {
    
        this.taxes.add(incomeTax);
    }

    void addTax(PropertyTax propertyTax) {
    
        this.taxes.add(propertyTax);
    }

    public String getFirstName() {
        return this.firstName;
    }

	public String getLastName() {
        return this.lastName;
    }
	public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

	public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public ArrayList<TaxCalculator> getTaxes()
    {
        return this.taxes;
    }

    void ListTaxes()
    {
        for ( TaxCalculator tax : this.taxes) {
            System.out.println("|--> " + tax);
            System.out.println("   \t| Need to pay ---> " + tax.getPrice_to_pay());
        }
    }
}

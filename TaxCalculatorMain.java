


public class TaxCalculatorMain {
    public static void main(String[] args) {
        TaxDatabase taxDatabase = new TaxDatabase();

        // Add taxpayers
        Taxpayer john = new Taxpayer("John", "Doe");
        john.addTax(new IncomeTax(50000));
        john.addTax(new LuxuryTax(20000));
        taxDatabase.addTaxpayer(john);

        Taxpayer jane = new Taxpayer("Jane", "Smith");
        jane.addTax(new PropertyTax(100000));
        taxDatabase.addTaxpayer(jane);

        // List all taxpayers
        taxDatabase.listTaxpayers();

        // Search for a taxpayer
        taxDatabase.searchTaxpayer("John", "Doe");

        // Update a taxpayer
        taxDatabase.updateTaxpayer("John", "Doe", "Johnny", "Doe");

        // Remove a taxpayer
        taxDatabase.removeTaxpayer("Jane", "Smith");

        // List all taxpayers again
        taxDatabase.listTaxpayers();
    }
}


/**
 * Write a description of class DB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// TaxDatabase class
import java.util.ArrayList;


class TaxDatabase {
    private ArrayList<Taxpayer> taxpayers;

    public TaxDatabase() {
        taxpayers = new ArrayList<>();
    }

    public void addTaxpayer(Taxpayer taxpayer) {
        taxpayers.add(taxpayer);
        System.out.println("Taxpayer added: " + taxpayer.getFirstName() + " " + taxpayer.getLastName());
    }

    public void removeTaxpayer(String firstName, String lastName) {
        for (int i = 0; i < taxpayers.size(); i++) {
            Taxpayer taxpayer = taxpayers.get(i);
            if (taxpayer.getFirstName().equalsIgnoreCase(firstName) &&
                taxpayer.getLastName().equalsIgnoreCase(lastName)) {
                taxpayers.remove(i);
                System.out.println("Taxpayer removed: " + taxpayer.getFirstName() + " " + taxpayer.getLastName());
                return;
            }
        }
        System.out.println("Taxpayer not found: " + firstName + " " + lastName);
    }

    public void updateTaxpayer(String firstName, String lastName, String newFirstName, String newLastName) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getFirstName().equalsIgnoreCase(firstName) &&
                taxpayer.getLastName().equalsIgnoreCase(lastName)) {
                taxpayer.setFirstName(newFirstName);
                taxpayer.setLastName(newLastName);
                System.out.println("Taxpayer updated: " + taxpayer.getFirstName() + " " + taxpayer.getLastName());
                return;
            }
        }
        System.out.println("Taxpayer not found: " + firstName + " " + lastName);
    }

    public void searchTaxpayer(String firstName, String lastName) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getFirstName().equalsIgnoreCase(firstName) &&
                taxpayer.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Taxpayer found: " + taxpayer.getFirstName() + " " + taxpayer.getLastName());
                taxpayer.ListTaxes();
                return;
            }
        }
        System.out.println("Taxpayer not found: " + firstName + " " + lastName);
    }

    public void listTaxpayers() {
        System.out.println("List of Taxpayers:");
        for (Taxpayer taxpayer : taxpayers) {
            System.out.println(taxpayer.getFirstName() + " " + taxpayer.getLastName());
            taxpayer.ListTaxes();
            
        }
    }
}

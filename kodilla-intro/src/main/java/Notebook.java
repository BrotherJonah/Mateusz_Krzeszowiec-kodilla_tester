public class Notebook {
    int weight; //atrybut klasy Notebook
    int price;
    int year;

    public Notebook(int weight, int price, int year) { //przykład konstruktora [public NazwaKlasy(typArgumentu nazwaArgumentu)]
        this.weight = weight; //przekazanie wartości argumentów konstruktora do atrybutów klasy (zmiennych) [Logika (przypisanie argumentów do zmiennych)]
        this.price = price;
        this.year = year;
    }

    public void checkPrice() { //public - "deklaracja dostępu", void - "pustka", to co ma zawierać metoda, może to być konkretny typ danych
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 & this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("To urzadzenie jest lekkie.");
        } else if (this.weight >= 601 & this.weight <= 1400){
            System.out.println("To urzadzenie jest niezbyt ciezkie.");
        } else {
            System.out.println("To urzadzenie jest bardzo ciezkie.");
        }
    }

    public void checkPriceYear() {
        if (this.price <= 600 & this.year <= 2013) {
            System.out.println(" Old - leasing version.\n");
        } else if ((this.price >= 600 & this.price <= 1000) & (this.year > 2013 & this.year <= 2020)) {
            System.out.println("Actual - budget version.\n");
        } else {
            System.out.println("New machine.\n");
        }
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2014);
        System.out.println(notebook.weight + "g " +  notebook.price + "zl " + notebook.year + "r");
        notebook.checkPrice(); //nazwa nowo utworzonego obiektu.nazwa metody
        notebook.checkWeight();
        notebook.checkPriceYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + "g " +  heavyNotebook.price + "zl " + heavyNotebook.year + "r");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + "zl " + oldNotebook.year + "r");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceYear();

        Notebook oneNotebook = new Notebook(980, 600, 2014);
        System.out.println(oneNotebook.weight + "g " + oneNotebook.price + "zl " + oneNotebook.year + "r");
        oneNotebook.checkPrice();
        oneNotebook.checkWeight();
        oneNotebook.checkPriceYear();

        Notebook twoNotebook = new Notebook(2500, 15000, 2019);
        System.out.println(twoNotebook.weight + "g " + twoNotebook.price + "zl " + twoNotebook.year + "r");
        twoNotebook.checkPrice();
        twoNotebook.checkWeight();
        twoNotebook.checkPriceYear();
    }
}
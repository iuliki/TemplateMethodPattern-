// Clasă concretă pentru prepararea ceaiului
class Ceai extends Bautura {

    @Override
    protected void adaugaIngredient() {
        System.out.println("Adaugă ceai în apa fierbinte");
    }

    @Override
    protected void amesteca() {
        System.out.println("Amestecă ceaiul");
    }

    @Override
    protected void toarnaInCupa() {
        System.out.println("Toarnă ceaiul în cupă");
    }
}
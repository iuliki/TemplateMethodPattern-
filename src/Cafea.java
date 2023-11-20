class Cafea extends Bautura {

    @Override
    protected void adaugaIngredient() {
        System.out.println("Adaugă cafea în apa fierbinte");
    }

    @Override
    protected void amesteca() {
        System.out.println("Amestecă cafeaua");
    }

    @Override
    protected void toarnaInCupa() {
        System.out.println("Toarnă cafeaua în cupă");
    }
}
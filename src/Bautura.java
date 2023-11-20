// Clasă abstractă care definește șablonul de preparare a băuturii
abstract class Bautura {

    // Template Method care definește pașii generali de preparare
    public final void preparaBautura() {
        fierbeApa();
        adaugaIngredient();
        amesteca();
        toarnaInCupa();
    }

    // Metode abstracte care vor fi implementate de clasele derivate
    protected abstract void adaugaIngredient();
    protected abstract void amesteca();
    protected abstract void toarnaInCupa();

    // Metodă comună pentru a fierbe apa
    private void fierbeApa() {
        System.out.println("Fierbe apa");
    }
}
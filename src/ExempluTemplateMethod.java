// Clasă principală pentru a demonstra utilizarea Template Method
public class ExempluTemplateMethod {
    public static void main(String[] args) {
        // Preparare ceai
        Bautura ceai = new Ceai();
        ceai.preparaBautura();

        System.out.println("-------------------");

        // Preparare cafea
        Bautura cafea = new Cafea();
        cafea.preparaBautura();
    }
}
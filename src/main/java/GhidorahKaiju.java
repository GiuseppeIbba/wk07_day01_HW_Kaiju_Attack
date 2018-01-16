public class GhidorahKaiju extends Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public GhidorahKaiju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);

    }

    public String roar(String roar) {
        return roar + ", GHIDORAH ANGRY!";
    }
}
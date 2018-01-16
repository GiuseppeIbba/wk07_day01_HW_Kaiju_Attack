import java.text.AttributedCharacterIterator;

public abstract class Kaiju {


    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healtValue, int attackValue) {
        this.name = name;
        this.healthValue = healtValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.healthValue;
    }

    public int getAttack() {
        return attackValue;
    }

    public abstract String roar(String roar);
}

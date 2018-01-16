public class GodzillaKaiju extends Kaiju {

    private  String name;
    private  int healthValue;
    private  int attackValue;

    public GodzillaKaiju(String name, int healthValue, int attackValue) {
       super(name, healthValue, attackValue);

    }

    public String roar(String roar) {
        return "GODZILLA DESTROY STUFF! " + roar;
    }


    public void attackVeichle(ArmyVeichle armyVeichle) {
        armyVeichle.healthValue -= this.attackValue;
    }
}

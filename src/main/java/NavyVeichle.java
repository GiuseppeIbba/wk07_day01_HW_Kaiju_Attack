public class NavyVeichle {

    String type;
    int healthValue;

    public NavyVeichle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String gettype() {
        return this.type;
    }

    public int getHealth() {
        return this.healthValue;
    }
}
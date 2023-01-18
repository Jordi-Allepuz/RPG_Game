public class Character {

    private String type;
    private static String[] typeList = {"Arquero", "Mago", "Caballero"}
    private int damage;
    private int life;
    private String name;


    public Character(String name, String type) {
        this.name = name;
        this.type = type;

        switch (type) {
            case "Arquero":
                this.life = 100;
                this.damage = 5;
                break;
            case "Mago":
                this.life = 80;
                this.damage = 15;
                break;
            case "Caballero":
                this.life = 120;
                this.damage = 10;
                break;
            default:
        }
    }


}

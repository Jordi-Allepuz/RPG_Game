public class Enemigo {

    private static String[] enemigos = {"Enemigo1", "Enemigo2", "Enemigo3"};
    private String type;
    private int damage;
    private int life;


    public Enemigo() {
        int numEnemy = (int) (Math.random() * 3) + 1;

        switch (numEnemy) {
            case 1:
                this.type = "Araña gigante";
                this.life = 50;
                this.damage = 3;
                break;
            case 2:
                this.type = "Caballero oscuro";
                this.life = 80;
                this.damage = 8;
                break;
            case 3:
                this.type = "Espectro";
                this.life = 30;
                this.damage = 2;
                break;
            default:
        }

    }


    public String toString() {

        return "-----Caracteristicas enemigo------" + "\n"
                + "Tipo: " + type + "\n"
                + "Daño: " + damage + "\n"
                + "Vida: " + life;
    }

}

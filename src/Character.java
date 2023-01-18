import java.util.Scanner;

public class Character {

    private String type;
    private static String[] typeList = {"Arquero", "Mago", "Caballero"};
    private int damage;
    private int life;
    private String name;


    public Character() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu de personaje");
        System.out.print("Escribe un nombre: ");
        this.name= sc.nextLine();
        System.out.println("Elige personaje");
        System.out.println("Pulsa 1 para Aquero");
        System.out.println("Pulsa 2 para Mago");
        System.out.println("Pulsa 3 para Caballero");
        int personaje=sc.nextInt();

        switch (personaje) {
            case 1:
                this.type="Arquero";
                this.life = 100;
                this.damage = 5;
                break;
            case 2:
                this.type="Mago";
                this.life = 80;
                this.damage = 15;
                break;
            case 3:
                this.type="Caballero";
                this.life = 120;
                this.damage = 10;
                break;
            default:
        }
    }


    public String toString(){

        return "Nombre: " + name + "\n" + "Tipo: " + type
                + "\n" + "Daño: " + damage + "\n" +
                "Vida: " + life;


    }


}

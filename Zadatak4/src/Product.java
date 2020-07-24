public class Product {
    public String nazivProizvoda;
    public String barKod;
    public double osnovnaCena;
    public double cenaSaPorezom;
    public static final double porez = 20;

    public void izracunajCenuSaPorezom(){
        this.cenaSaPorezom = this.osnovnaCena+this.osnovnaCena/(100/porez);
    }
}

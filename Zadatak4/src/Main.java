public class Main {

    public static void main(String[] args) {
        Wine w = new Wine("Vino123","12323454234",789.25,0.75);
        w.izracunajCenuSaPorezom();
        System.out.println(w);

        Chocolate c = new Chocolate("Milka","123646687",356.25,300.0);
        c.izracunajCenuSaPorezom();
        System.out.println(c);
    }
}

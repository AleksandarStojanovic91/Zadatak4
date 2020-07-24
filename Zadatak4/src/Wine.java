public class Wine extends Product{

    public static final double dodatniPorez = 10;
    public double zapreminaBoce;
    public double cenaSaDodatnimPorezom;

    public Wine(String nazivProizvoda, String barKod, double osnovnaCena, double zapreminaBoce){
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    public void izracunajCenuSaPorezom() {
        this.cenaSaPorezom = this.osnovnaCena+this.osnovnaCena/(100/Product.porez);
        this.cenaSaDodatnimPorezom = this.cenaSaPorezom+this.cenaSaPorezom/(100/Wine.dodatniPorez);
    }

    @Override
    public String toString() {
        return "Naziv proizvoda: "+this.nazivProizvoda+" bar kod: "+this.barKod+" osnovna cena: "+this.osnovnaCena+" zapremina boce: "+this.zapreminaBoce+" cena sa porezom: "+this.cenaSaPorezom+" cena sa dodatnim porezom "+this.cenaSaDodatnimPorezom;
    }
}

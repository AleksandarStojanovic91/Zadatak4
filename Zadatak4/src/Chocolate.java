public class Chocolate extends Product{
    public double tezina;

    public Chocolate(String nazivProizvoda, String barKod, double osnovnaCena, double tezina){
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Naziv proizvoda: "+this.nazivProizvoda+" bar kod: "+this.barKod+" osnovna cena: "+this.osnovnaCena+" tezina: "+this.tezina+" cena sa porezom: "+this.cenaSaPorezom;
    }
}

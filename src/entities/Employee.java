package entities;

public class Currency {
    public Currency() {
        this.dolar = dolar;
    }

    public double dolar = 2;

    public double calc(double total){
        return (dolar*total)*1.06;
    }

}

public class Main {
    public static void main(String[] args) {
        Carro a=new CarroToyota("Toyota","999999","Rojo",1500000);
        Carro b=new CarroCorvette("Corvette","123ass","Azul",200000);
        a.encender();
        a.muestraVelocidadMaxima();
        a.apagar();

        b.encender();
        b.muestraVelocidadMaxima();
        b.apagar();
    }
}

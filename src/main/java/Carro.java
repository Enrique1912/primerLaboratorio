public class Carro {
    private String marca;
    private String id;
    private String color;
    private double cantFabricados;

    public Carro(){
        marca="Indeterminado";
        id="Indeterminado";
        color="Indeterminado";
        cantFabricados=0.0;
    }
    public Carro(String a,String b,String c,int d){
        marca=a;
        id=b;
        color=c;
        cantFabricados=d;
    }

    public void encender(){
        System.out.println("El carro esta encendido");
    }

    public void apagar(){
        System.out.println("El carro esta apagado");
    }
    public void muestraVelocidadMaxima(){
        System.out.println("Este carro es comun y corriente pero tiene una velocidad maxima de 20 km/h");
    }

}

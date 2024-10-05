public class CarroAnfibio extends Carro implements Navegando, Voando{


    public CarroAnfibio(int chassi, String nome, String modelo, int ano) {
        super(chassi, nome, modelo, ano);
    }

    @Override
    public void navegar() {
    System.out.println("navegando");
    }

    @Override
    public void voar() {
        System.out.println("voando");
    }
}

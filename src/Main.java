public class Main {
    public static void main (String[] args){
        CarroAnfibio Cybertruck = new CarroAnfibio(1, "Cyber", "truck", 2024);
        System.out.println("O veiculo criado foi: " + Cybertruck.getNome());
        Cybertruck.navegar();
        Cybertruck.voar();
    }
}

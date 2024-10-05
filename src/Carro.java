public class Carro {
    private int chassi;
    private String nome;
    private String modelo;
    private int ano;
    public Carro(int chassi, String nome, String modelo, int ano){
        this.chassi = chassi;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }


    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void locomover() {
        System.out.println("Se locomovendo");
    }

}

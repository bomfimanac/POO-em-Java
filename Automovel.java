public class Automovel {
    // 1. Atributos encapsulados (private)
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean motorLigado;

    // 2. Construtor
    public Automovel(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.motorLigado = false; // Todo carro inicia com o motor desligado
    }

    // 3. Métodos de Comportamento
    public void ligarMotor() {
        if (!this.motorLigado) {
            this.motorLigado = true;
            System.out.println("O motor do " + this.modelo + " foi ligado!");
        } else {
            System.out.println("O motor do " + this.modelo + " já está ligado.");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println("O motor do " + this.modelo + " foi desligado.");
        } else {
            System.out.println("O motor do " + this.modelo + " já está desligado.");
        }
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("O Preço do " + this.modelo + " atualizado para: R$ " + this.preco);
        } else {
            System.out.println("Erro: O preço precisa ser um valor positivo!");
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("\n==================================");
        System.out.println("       FICHA TÉCNICA - VEÍCULO    ");
        System.out.println("==================================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Status do Motor: " + (this.motorLigado ? "LIGADO" : "DESLIGADO"));
        System.out.println("==================================\n");
    }

    // 4. Métodos Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getPreco() { return preco; }
    // Nota: O setPreco pode ser substituído pelo método de negócio atualizarPreco()
}

/*1. Arquivo: Automovel.java  SuperClasse, Classe pai , Classe mae*/
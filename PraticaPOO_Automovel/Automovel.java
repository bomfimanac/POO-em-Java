public class Automovel {
    // 1. Atributos Privados (Encapsulamento)
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean motorLigado;

    // 2. Construtor para inicializar os atributos
    public Automovel(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.motorLigado = false; // Todo carro começa desligado na memória
    }

    // 3. Métodos Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    // O motor não tem "set" direto para evitar ligar sem passar pela validação do método
    public boolean isMotorLigado() { return motorLigado; }

    // 4. Métodos de Comportamento
    public void ligarMotor() {
        if (!this.motorLigado) {
            this.motorLigado = true;
            System.out.println("Vrumm! O motor do " + this.modelo + " foi LIGADO.");
        } else {
            System.out.println("Aviso: O motor do " + this.modelo + " já está ligado.");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println("O motor do " + this.modelo + " foi DESLIGADO.");
        } else {
            System.out.println("Aviso: O motor do " + this.modelo + " já está desligado.");
        }
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("Preço do " + this.modelo + " atualizado para: R$ " + this.preco);
        } else {
            System.out.println("Erro: Preço inválido.");
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("\n=== FICHA TÉCNICA ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Motor Ligado? " + (this.motorLigado ? "Sim" : "Não"));
        System.out.println("=====================");
    }
}
// Herança: Carro é uma subclasse de Automovel
public class Carro extends Automovel {
    private int numeroPortas;
    private String tipoCombustivel;

    // Construtor da subclasse
    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, preco); // Chama o construtor da superclasse
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters e Setters específicos da subclasse
    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public String getTipoCombustivel() { return tipoCombustivel; }
    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    // Método específico da subclasse
    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica(); // Chama o método da superclasse
        System.out.println("Número de Portas: " + this.numeroPortas);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
    }
}

// A palavra-chave 'extends' indica que Caminhao HERDA tudo da classe Automovel
public class Caminhao extends Automovel {
    
    // Atributos específicos da subclasse (o Automovel comum não possui)
    private double capacidadeCargaDiretriz; // em toneladas
    private int quantidadeEixos;

    // Construtor da subclasse
    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga, int eixos) {
        // A palavra 'super' invoca OBRIGATORIAMENTE o construtor da classe mãe (Automovel)
        // para inicializar os atributos herdados.
        super(marca, modelo, ano, preco); 
        
        // Inicializa os atributos exclusivos da classe Caminhao
        this.capacidadeCargaDiretriz = capacidadeCarga;
        this.quantidadeEixos = eixos;
    }

    // Método exclusivo da subclasse
    public void carregarCarga(double peso) {
        if (peso <= this.capacidadeCargaDiretriz) {
            System.out.println("O caminhão " + getModelo() + " foi carregado com " + peso + " toneladas.");
        } else {
            System.out.println("Alerta de Segurança: Peso de " + peso + "t excede o limite máximo de " + this.capacidadeCargaDiretriz + "t!");
        }
    }

    // Sobrescrita de Método (Polimorfismo): Vamos adaptar a Ficha Técnica para o Caminhão
    @Override // Esta anotação avisa o compilador que estamos modificando um método que veio da classe mãe
    public void exibirFichaTecnica() {
        // Podemos chamar o comportamento do método original usando super.exibirFichaTecnica()
        super.exibirFichaTecnica();
        // E agora adicionamos as informações específicas do caminhão no final
        System.out.println("--- Dados do Transporte Pesado ---");
        System.out.println("Capacidade Máxima: " + this.capacidadeCargaDiretriz + " Toneladas");
        System.out.println("Número de Eixos: " + this.quantidadeEixos);
        System.out.println("==================================\n");
    }

    // Getters e Setters específicos
    public double getCapacidadeCargaDiretriz() { return capacidadeCargaDiretriz; }
    public void setCapacidadeCargaDiretriz(double capacidadeCarga) { this.capacidadeCargaDiretriz = capacidadeCarga; }

    public int getQuantidadeEixos() { return quantidadeEixos; }
    public void setQuantidadeEixos(int eixos) { this.quantidadeEixos = eixos; }
}

/*4. Arquivo: Caminhao.java SubClasse, classe filho , classe filha*/
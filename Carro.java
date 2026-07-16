// A palavra-chave 'extends' liga a classe Carro à classe mãe Automovel
public class Carro extends Automovel {

    // Atributos específicos e exclusivos da classe Carro
    //Criar novos atributos para classe Carro
    private int quantidadePortas;
    private String tipoCarroceria; // Ex: Sedan, Hatch, SUV, Cupê

    // Construtor da subclasse
    public Carro(String marca, String modelo, int ano, double preco, int quantidadePortas, String tipoCarroceria) {
        // Envia obrigatoriamente os dados genéricos para o construtor da superclasse (Automovel)
        super(marca, modelo, ano, preco);

        // Inicializa as propriedades que pertencem apenas ao Carro
        this.quantidadePortas = quantidadePortas;
        this.tipoCarroceria = tipoCarroceria;
    }

    // Método de comportamento exclusivo do Carro de passeio
    public void abrirPortaMalas() {
        System.out.println("O porta-malas do " + getModelo() + " (" + this.tipoCarroceria + ") foi aberto pelo controle remoto.");
    }

    // Sobrescrita de Método (Polimorfismo): Adaptando a Ficha Técnica para as características de um Carro
    @Override
    public void exibirFichaTecnica() {
        // Invoca o comportamento padrão escrito em Automovel (Evita duplicação de código)
        super.exibirFichaTecnica();
        
        // Adiciona informações específicas do veículo de passeio
        System.out.println("--- Especificações de Veículo de Passeio ---");
        System.out.println("Quantidade de Portas: " + this.quantidadePortas);
        System.out.println("Tipo de Carroceria: " + this.tipoCarroceria);
        System.out.println("==================================\n");
    }

    // Getters e Setters específicos
    public int getQuantidadePortas() { return quantidadePortas; }
    public void setQuantidadePortas(int quantidadePortas) { this.quantidadePortas = quantidadePortas; }

    public String getTipoCarroceria() { return tipoCarroceria; }
    public void setTipoCarroceria(String tipoCarroceria) { this.tipoCarroceria = tipoCarroceria; }
}

/*3. Arquivo: Carro.java  SubClasse, classe filho , classe filha*/
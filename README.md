# Prática POO: Modelando um Automóvel em Java

Atividade prática para aplicação dos conceitos essenciais de **Programação Orientada a Objetos (POO)** em Java, com foco em **Encapsulamento**, construtores, métodos de acesso (Getters/Setters) e manipulação do estado interno de objetos na memória.

---

## 🎯 Objetivo da Atividade

Aplicar os fundamentos da Orientação a Objetos construindo uma classe estruturada com atributos privados, instanciando objetos a partir de uma classe principal e realizando a chamada de métodos para alterar o estado interno das instâncias.

---

## ⚙️ Estrutura do Projeto

O projeto é composto por dois arquivos principais:
* `Automovel.java`: A classe de entidade (molde) que define os atributos e comportamentos do carro.
* `Main.java`: A classe principal que cria o objeto na memória e executa os testes lógicos.

---

## 💻 Código Fonte

### 1. Automovel.java
```java
public class Automovel {
    // Atributos Privados (Encapsulamento)
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean motorLigado;

    // Construtor
    public Automovel(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.motorLigado = false;
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public boolean isMotorLigado() { return motorLigado; }

    // Métodos de Comportamento
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

### 2. Main.java
```java
public class Main {
    // Ponto de entrada obrigatório: A máquina virtual Java (JVM) procura o método 'main' para iniciar o programa.
    public static void main(String[] args) {
        
        // --- 1. INSTANCIAÇÃO (Criação do Objeto na Memória) ---
        // A palavra 'new' aloca espaço na memória RAM para um novo carro real.
        // Estamos chamando o Construtor da classe Automovel para preencher a ficha de fábrica do veículo.
        Automovel meuCarro = new Automovel("Chevrolet", "Onix", 2023, 85000.00);

        System.out.println("--- 1. Estado Inicial ---");
        // A Main não acessa as variáveis diretamente. Ela "pede" para o objeto executar seu comportamento de exibir os dados.
        meuCarro.exibirFichaTecnica();

        System.out.println("\n--- 2. Testando o Motor ---");
        // Alterando o estado interno do objeto (motorLigado passa de 'false' para 'true')
        meuCarro.ligarMotor();      
        
        // Validando a lógica interna: 
        // Como o método ligarMotor() tem um 'if', o próprio objeto percebe que já está ligado e avisa a Main, impedindo um comando redundante.
        meuCarro.ligarMotor(); 
        
        System.out.println("\n--- 3. Atualizando Dados (Encapsulamento) ---");
        // Modificação segura: A Main não pode fazer 'meuCarro.preco = 82000' direto porque o atributo é 'private'.
        // Ela é obrigada a usar o método público 'atualizarPreco()', que garante que valores negativos sejam barrados.
        meuCarro.atualizarPreco(82000.00);

        System.out.println("\n--- 4. Estado Final ---");
        meuCarro.desligarMotor();
        meuCarro.exibirFichaTecnica();
    }
}
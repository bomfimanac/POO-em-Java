public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o Sistema da Concessionária...\n");

        // 1. Instanciando objetos (criando instâncias na memória)
        Automovel carro1 = new Automovel("Toyota", "Corolla", 2024, 150000.00);
        Automovel carro2 = new Automovel("Honda", "Civic", 2023, 145000.00);

        // 2. Exibindo o estado inicial (Atributos padrão do construtor)
        carro1.exibirFichaTecnica();
        carro2.exibirFichaTecnica();

        // 3. Enviando mensagens para alterar o estado do carro1
        System.out.println("--- Testando interações com o Corolla ---");
        carro1.ligarMotor();
        carro1.atualizarPreco(155000.00); // Valoriza por alta demanda

        // 4. Enviando mensagens para o carro2
        System.out.println("\n--- Testando interações com o Civic ---");
        carro2.desligarMotor(); // Tentando desligar motor já desligado
        carro2.ligarMotor();
        carro2.desligarMotor();

        // 5. Exibindo o estado final para comprovar que são objetos independentes
        System.out.println("\n--- ESTADO FINAL DOS VEÍCULOS ---");
        carro1.exibirFichaTecnica(); // Continuará com motor LIGADO e preço novo
        carro2.exibirFichaTecnica(); // Continuará com motor DESLIGADO
    }
}

/*2. Arquivo: Main.java
No arquivo principal, demonstra como instanciar objetos distintos e enviar mensagens (chamar métodos) 
que modificam o estado de apenas uma instância, provando o conceito de Identidade e independência dos objetos. */
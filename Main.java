public class Main {
    public static void main(String[] args) {
        // Instanciando o carro na memória (Chamando o Construtor)
        Automovel meuCarro = new Automovel("Chevrolet", "Onix", 2023, 85000.00);

        // 1. Exibindo o estado inicial
        System.out.println("--- 1. Estado Inicial ---");
        meuCarro.exibirFichaTecnica();

        // 2. Testando os comportamentos (Ligar e tentar ligar de novo)
        System.out.println("\n--- 2. Testando o Motor ---");
        meuCarro.ligarMotor();      
        meuCarro.ligarMotor(); // Deve disparar o aviso de que já está ligado
        
        // 3. Modificando atributos com segurança
        System.out.println("\n--- 3. Atualizando Dados ---");
        meuCarro.atualizarPreco(82000.00);

        // 4. Desligando e exibindo o resultado final
        System.out.println("\n--- 4. Estado Final ---");
        meuCarro.desligarMotor();
        meuCarro.exibirFichaTecnica();
    }
}
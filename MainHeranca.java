public class MainHeranca {
    public static void main(String[] args) {
        System.out.println("Sistema Integrado da Concessionária - Teste de Herança de Veículos\n");

        // 1. Instanciando um Caminhão (Subclasse 1)
        Caminhao caminhaoGrande = new Caminhao("Scania", "R 540", 2024, 720000.00, 80.0, 6);

        // 2. Instanciando diferentes Carros de Passeio (Subclasse 2)
        // Aqui demonstramos os exemplos de carroceria: SUV, Sedan, Hatch e Cupê
        Carro carroSUV = new Carro("Honda", "HR-V", 2025, 160000.00, 4, "SUV");
        Carro carroSedan = new Carro("Toyota", "Corolla", 2024, 150000.00, 4, "Sedan");
        Carro carroHatch = new Carro("Chevrolet", "Onix", 2023, 85000.00, 4, "Hatch");
        Carro carroCupe = new Carro("Porsche", "911 Carrera", 2026, 900000.00, 2, "Cupê");

        // 3. Testando interações com os Carros (Métodos herdados e exclusivos)
        System.out.println("=== Interagindo com os Carros ===");
        
        carroSUV.ligarMotor(); // Método herdado de Automovel
        carroSUV.abrirPortaMalas(); // Método exclusivo de Carro

        System.out.println();
        carroHatch.ligarMotor();
        carroHatch.atualizarPreco(87000.00); // Método herdado de Automovel

        System.out.println();
        carroCupe.abrirPortaMalas();

        // 4. Testando o Caminhão para contrapor com as regras do Carro
        System.out.println("\n=== Interagindo com o Caminhão ===");
        caminhaoGrande.ligarMotor();
        caminhaoGrande.carregarCarga(45.0); // Método exclusivo de Caminhao

        // 5. Exibindo as Fichas Técnicas Personalizadas (Polimorfismo em Ação)
        System.out.println("\n=== FICHAS TÉCNICAS DOS CARROS DE PASSEIO ===");
        carroSUV.exibirFichaTecnica();
        carroSedan.exibirFichaTecnica();
        carroHatch.exibirFichaTecnica();
        carroCupe.exibirFichaTecnica();

        System.out.println("=== FICHA TÉCNICA DO TRANSPORTE PESADO ===");
        caminhaoGrande.exibirFichaTecnica();
    }
}

/*5. Arquivo: MainHeranca.java
No arquivo principal, demonstra como instanciar objetos distintos e enviar mensagens (chamar métodos) 
que modificam o estado de apenas uma instância, provando o conceito de Identidade e independência dos objetos. */
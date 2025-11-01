package br.com.engenheirodesoftwarenoespaco.projetoswingfaculdade;

public class TesteSingleton {

    public static void main(String[] args) {
        
        System.out.println("--- Teste de Unicidade do Singleton ---");
        
        // Chamada 1: A primeira vez que chamamos, a instância é criada.
        System.out.println("\n[1] Chamando getInstance() pela primeira vez...");
        ConfiguracaoSistema singleton1 = ConfiguracaoSistema.getInstance();
        
        // Chamada 2: A segunda vez, a mesma instância já criada deve ser retornada.
        System.out.println("[2] Chamando getInstance() pela segunda vez...");
        ConfiguracaoSistema singleton2 = ConfiguracaoSistema.getInstance();

        // --------------------------------------------------------------------
        // REQUISITO 6: Verificar se a mesma instância é utilizada
        // Compara se as referências (endereços de memória) são as mesmas.
        // --------------------------------------------------------------------
        
        System.out.println("\n--- Verificação de Referências ---");

        // O '==' em objetos compara se as referências apontam para o mesmo local.
        if (singleton1 == singleton2) {
            System.out.println("SUCESSO! As referências singleton1 e singleton2 SÃO IDÊNTICAS.");
            System.out.println("Isso prova que o Padrão Singleton GARANTIU uma única instância.");
        } else {
            System.out.println("FALHA! O Singleton não funcionou corretamente.");
        }

        // REQUISITO 7: Implementar um exemplo prático
        System.out.println("\n--- Demonstração Prática ---");
        System.out.println("Status T1: " + singleton1.getStatus());
        System.out.println("Status T2: " + singleton2.getStatus());
    }
}

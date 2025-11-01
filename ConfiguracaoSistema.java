package br.com.engenheirodesoftwarenoespaco.projetoswingfaculdade;

public class ConfiguracaoSistema {

    // REQUISITO 4: Um campo estático para armazenar a única instância (Singleton)
    // O 'instance' é privado e estático, garantindo que só existe um e ninguém muda ele.
    private static ConfiguracaoSistema instance; 
    
    // Campo simples para demonstrar que a instância única carrega dados
    private String logStatus = "Sistema de Log Desativado";

    // REQUISITO 3: Um construtor privado para impedir instâncias externas
    // Isso bloqueia o uso de 'new ConfiguracaoSistema()' fora desta classe.
    private ConfiguracaoSistema() {
        System.out.println("✅ Instância Singleton criada! (Só deve aparecer uma vez)");
        // Inicializa o status no momento da criação
        this.logStatus = "Sistema de Log Ativo e Operacional."; 
    }

    // REQUISITO 5: Um método estático público para acessar a instância
    public static ConfiguracaoSistema getInstance() {
        // Verifica se a instância é nula (se ainda não foi criada)
        if (instance == null) {
            // Se for nula, cria a única instância permitida.
            instance = new ConfiguracaoSistema();
        }
        // Retorna a instância única existente.
        return instance;
    }

    // Método de demonstração para provar que a instância funciona
    public String getStatus() {
        return "Status da Configuração: " + logStatus;
    }
}

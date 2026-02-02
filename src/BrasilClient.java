package br.com.brasilclient;

/**
 * BRASIL CLIENT - CORE OFICIAL
 * Focado em FPS, Sistema de Level e Segurança.
 */
public class BrasilClient {

    public static final String VERSION = "1.0-ALPHA";
    public static final String CLIENT_NAME = "Brasil Client";
    
    // Status do Jogador
    private int playerLevel = 1;
    private int brasilCoins = 0;
    private boolean isUltraPlus = false;

    public void startClient() {
        System.out.println("Iniciando " + CLIENT_NAME + " v" + VERSION);
        System.out.println("Carregando Textura Nativa (Short Swords & Low Fire)...");
        
        // Ativando FPS Boost por padrão
        setFPSBoost(true);
    }

    // Sistema de Level 10 (Barreira para Rankeada)
    public boolean canEnterRanked() {
        if (playerLevel >= 10) {
            System.out.println("Acesso liberado para Rankeadas! ⚔️");
            return true;
        } else {
            System.out.println("Acesso negado. Você precisa ser Level 10. 👁👄👁");
            return false;
        }
    }

    // Sistema de Ganho de Coins (5 moedas a cada 10 min)
    public void addCoinsByTime(int timeInMinutes) {
        if (timeInMinutes >= 10) {
            int coinsToEarn = (timeInMinutes / 10) * 5;
            this.brasilCoins += coinsToEarn;
            System.out.println("Você recebeu " + coinsToEarn + " Brasil Coins pelo seu tempo de jogo!");
        }
    }

    // Configuração de FPS
    public void setFPSBoost(boolean enabled) {
        if (enabled) {
            System.out.println("Otimização de memória e partículas ativada.");
        }
    }

    public int getBrasilCoins() {
        return brasilCoins;
    }
}

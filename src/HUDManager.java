package br.com.brasilclient.ui;

public class HUDManager {

    private boolean showFPS = true;
    private boolean showLevel = true;
    private boolean showCoins = true;

    /**
     * Renderiza as informações na tela do jogador.
     * Focado em ser limpo e não atrapalhar o PvP.
     */
    public void renderHUD(int currentFPS, int playerLevel, int coins) {
        if (showFPS) {
            drawText("FPS: " + currentFPS, 10, 10, 0xFFFFFF); // Branco
        }

        if (showLevel) {
            // Se o level for menor que 10, fica amarelo (alerta)
            int color = (playerLevel < 10) ? 0xFFFF00 : 0x00FF00; 
            drawText("Level: " + playerLevel + " / 10", 10, 25, color);
        }

        if (showCoins) {
            drawText("Brasil Coins: " + coins, 10, 40, 0xFFAA00); // Laranja/Ouro
        }
    }

    // Simulação de desenho de texto na tela do Minecraft
    private void drawText(String text, int x, int y, int color) {
        // No código real, aqui usamos o fontRendererObj.drawString
        System.out.println("[HUD] Renderizando: " + text + " na posição " + x + "," + y);
    }

    public void toggleFPS() {
        this.showFPS = !this.showFPS;
    }
}

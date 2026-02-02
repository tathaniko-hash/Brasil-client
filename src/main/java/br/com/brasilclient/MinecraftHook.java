package br.com.brasilclient;

import net.minecraft.client.Minecraft;
import br.com.brasilclient.ui.HUDManager;

public class MinecraftHook {

    private Minecraft mc = Minecraft.getMinecraft();
    private HUDManager hud = new HUDManager();

    // Esse método roda a cada "frame" do jogo (Render Tick)
    public void onRenderTick() {
        if (mc.thePlayer != null && !mc.gameSettings.showDebugInfo) {
            // Puxa o FPS real do jogo e o seu sistema de Level
            int fps = Minecraft.getDebugFPS();
            int level = BrasilClient.instance.levelSystem.getCurrentLevel();
            int coins = BrasilClient.instance.getBrasilCoins();

            // Desenha o seu HUD na tela
            hud.renderHUD(fps, level, coins);
        }
    }

    // Gerenciador de Mods de Performance
    public void applyPerformanceMods() {
        mc.gameSettings.animatedWater = false;
        mc.gameSettings.animatedLava = false;
        mc.gameSettings.particleSetting = 2; // Partículas reduzidas
        System.out.println("Brasil Client: Mods de FPS Aplicados! 🚀");
    }
}

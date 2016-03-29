package com.anime_sekai.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.anime_sekai.HiraganaMemory;
import com.anime_sekai.Ressources;

public class HiraganaMemoryLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Ressources.SCREEN_WIDTH;
		config.height = Ressources.SCREEN_HEIGHT;
		config.resizable = false;
		config.fullscreen = false;
		config.title = "Hiragana Memory Card Game";
		config.vSyncEnabled = false;
		config.x = -1;
		config.y = -1;
		new LwjglApplication(new HiraganaMemory(), config);
	}
}

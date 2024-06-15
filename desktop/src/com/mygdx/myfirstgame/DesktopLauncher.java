package com.mygdx.myfirstgame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.myfirstgame.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("My First Game(drop)");
		config.setWindowedMode(800,480);
		config.useVsync(true);
		new Lwjgl3Application(new MyGdxGame(), config);
	}
}

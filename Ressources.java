package com.anime_sekai;

public class Ressources {
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;

	private static int spaceBetweenTiles = (SCREEN_WIDTH - 5 * 100) / 6;
	private static int tileSize = 100;

	public static String[] hiragana_tiles = { "tiles/chi-hiragana.png", "tiles/fu-hiragana.png", "tiles/ku-hiragana.png",
			"tiles/mi-hiragana.png", "tiles/o-hiragana.png", "tiles/ta-hiragana.png" };

	public static String[] roomaji_tiles = { "tiles/chi-roomaji.png", "tiles/fu-roomaji.png", "tiles/ku-roomaji.png",
			"tiles/mi-roomaji.png", "tiles/o-roomaji.png", "tiles/ta-roomaji.png" };

	public static int[] positionsX = { spaceBetweenTiles, spaceBetweenTiles * 2 + tileSize,
			spaceBetweenTiles * 3 + tileSize * 2, spaceBetweenTiles * 4 + tileSize * 3,
			spaceBetweenTiles * 5 + tileSize * 4 };

	public static int[] positionsY = { spaceBetweenTiles, spaceBetweenTiles * 2 + tileSize,
			spaceBetweenTiles * 3 + tileSize * 2, spaceBetweenTiles * 4 + tileSize * 3 };

}

package org.ads;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TextDocument {
	private List<Graphic> graphics;

	public TextDocument() {
		graphics = new ArrayList<>();
	}

	public void addGraphic(Graphic graphic) {
		graphics.add(graphic);
	}

	public void removeGraphic(Graphic graphic) {
		graphics.remove(graphic);
	}

	public void drawDocument() {
		for (Graphic graphic : graphics) {
			graphic.Draw(new Point(0, 0)); // Desenha cada elemento gráfico na posição (0, 0)
		}
	}
}

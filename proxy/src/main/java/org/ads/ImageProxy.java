package org.ads;

import java.awt.*;
import java.io.*;

public class ImageProxy implements Graphic {

	private Image image;
	private Point extent;
	private String fileName;

	public ImageProxy(String file) {
		this.fileName = file;
		this.extent = extent;
		this.fileName = fileName;
	}

	protected Image getImage() {
		if (image == null) {
			image = new Image(fileName);
		}
		return image;

	}

	@Override
	public void Draw(Point at) {

	}

	@Override
	public void HandleMouse(AWTEvent event) {

	}

	@Override
	public Point GetExtent() {
		if (extent == null) {
			extent = getImage().GetExtent();
		}
		return extent;
	}

	@Override
	public void Load(InputStream from) {
		try (DataInputStream dataInputStream = new DataInputStream(from)) {
			// Lê a extensão da imagem do fluxo de entrada
			int width = dataInputStream.readInt();
			int height = dataInputStream.readInt();
			extent = new Point(width, height);

			// Lê o nome do arquivo da imagem do fluxo de entrada
			fileName = dataInputStream.readUTF();
		} catch (IOException e) {
			e.printStackTrace(); // Trata o erro de E/S, se ocorrer
		}
	}

	@Override
	public void Save(OutputStream to) throws IOException {
		try (DataOutputStream dataOutputStream = new DataOutputStream(to)) {
			dataOutputStream.writeInt(extent.x);
			dataOutputStream.writeInt(extent.y);
			dataOutputStream.writeUTF(fileName);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}

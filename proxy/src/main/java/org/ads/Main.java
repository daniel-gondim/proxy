package org.ads;

public class Main {
    public static void main(String[] args) {
        // Cria um novo documento de texto
        TextDocument document = new TextDocument();

        // Adiciona um objeto ImageProxy ao documento
        String fileName = "example.jpg"; // Nome do arquivo da imagem
        ImageProxy imageProxy = new ImageProxy(fileName);
        document.addGraphic(imageProxy);
        System.out.println("Imagem adicionada ao documento.");

        // Adiciona outros objetos gráficos ao documento, se necessário
        // Exemplo:
        // Rectangle rectangle = new Rectangle(50, 50);
        // document.addGraphic(rectangle);

        // Desenha o documento
        document.drawDocument();
        System.out.println("Documento desenhado com sucesso.");

    }
}

class RetanguloSimples {
    public static void desenhar(int largura, int altura, String texto) {
        String linhaSuperior = "+" + "-".repeat(largura) + "+";
        String linhaVazia = "|" + " ".repeat(largura) + "|";
        String textoFormatado = "| " + String.format("%-" + largura + "s", texto) + " |";
        System.out.println(linhaSuperior);
        for (int i = 0; i < altura; i++) {
            System.out.println(i == altura / 2 ? textoFormatado : linhaVazia);
        }
        System.out.println(linhaSuperior);
    }
}
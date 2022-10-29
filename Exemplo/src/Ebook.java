import javax.swing.JOptionPane;

public class Ebook {

    private String tema;
    private int numeroPaginas;
    private int imagens;
    private int numeroImagens;


    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public int getImagens() {
        return imagens;
    }
    public void setImagens(int imagens) {
        this.imagens = imagens;
    }
    public int getNumeroImagens() {
        return numeroImagens;
    }
    public void setNumeroImagens(int numeroImagens) {
        this.numeroImagens = numeroImagens;
    }

    public void inserirDados() {
        this.tema = JOptionPane.showInputDialog("Tema do e-book:");
        this.numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Número de páginas:"));
        this.imagens = JOptionPane.showConfirmDialog(null, "Deseja imagens:");

        if(imagens == JOptionPane.YES_OPTION) {
            this.numeroImagens = Integer.parseInt(JOptionPane.showInputDialog("Número de imagens:"));
        }
        else if(imagens == JOptionPane.NO_OPTION || imagens == JOptionPane.CANCEL_OPTION) {
            this.numeroImagens = 0;
        }
    }
    public void mostrar() {

        String mensagem = "teste\n";
        mensagem += "Tema do e-book: " + this.tema + "\n";
        mensagem += "Número de páginas: " + this.numeroPaginas + "\n";
        mensagem += "Número de imagens: " + this.numeroImagens + "\n";



        JOptionPane.showMessageDialog(null, mensagem);
    }
}
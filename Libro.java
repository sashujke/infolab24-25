/**
 * @author stocco
 */

 public class Libro {
    private String nome;
    private String scrittore;
    private int anno;
    private String casaEditrice;

    // Costruttore
    public Libro(String nome, String scrittore, int anno, String casaEditrice) {
        this.nome = nome;
        this.scrittore = scrittore;
        this.anno = anno;
        this.casaEditrice = casaEditrice;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getScrittore() {
        return scrittore;
    }

    public int getAnno() {
        return anno;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Scrittore: " + scrittore + ", Anno: " + anno + ", Casa Editrice: " + casaEditrice;
    }
}

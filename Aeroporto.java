//Clara dos Santos Becker e Erick Augusto Warmling
import java.util.ArrayList;

public class Aeroporto {
    private String nome;
    private String cidade;
    private String estado;
    private String pais;
    private ArrayList<Aeronave> aeronaves;

    public Aeroporto(String nome, String cidade, String estado, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.aeronaves = new ArrayList<Aeronave>();
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if (!cidade.isEmpty()) {
            this.cidade = cidade;
            return true;
        }
        return false;

    }

    public String getEstado() {
        return estado;
    }

    public boolean setEstado(String estado) {
        if (!estado.isEmpty() && estado.length() == 2) {
            this.estado = estado;
            return true;
        }
        return false;

    }

    public String getPais() {
        return pais;
    }

    public boolean setPais(String pais) {
        if (!pais.isEmpty()) {
            this.pais = pais;
        }
        return false;
    }

    public void addAeronave(Aeronave aviao) {
        if (!this.aeronaves.contains(aviao)) {
            this.aeronaves.add(aviao);
        }
    }

    public boolean removerAeronave(int codigo) {
        for (Aeronave aviao : this.aeronaves) {
            if (aviao.getCodigo() == codigo) {
                this.aeronaves.remove(aviao);
                return true;
            }
        }
        return false;
    }

    public void imprimirAeronaves() {
        System.out.println("Aeronaves no pátio: ");
        for (Aeronave aviao : this.aeronaves) {
            System.out.println(aviao.toString());
        }
    }

    public void imprimirAeronaves(String companhia) {
        System.out.println("Aeronaves da companhia "+ companhia + ":" );
        for (Aeronave aviao : this.aeronaves) {
            if (aviao.getCompanhia().equalsIgnoreCase(companhia)) {
                System.out.println(aviao.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", Cidade: " + cidade + ", Estado: " + estado + ", Pais: " + pais;
    }

}
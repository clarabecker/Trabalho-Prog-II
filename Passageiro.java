//Clara dos Santos Becker e Erick Augusto Warmling
public class Passageiro extends Pessoa {
    private String classe;
    private int poltrona;

    public Passageiro(String nome, int idade, String cpf, String voo, String destino, String classe, int poltrona) {
        super(nome, idade, cpf, voo, destino);
        this.classe = classe;
        this.poltrona = poltrona;
        
    }

    public String getClasse() {
        return classe;
    }

    public boolean setClasse(String classe) {
        if (classe.equalsIgnoreCase("econômica") || classe.equalsIgnoreCase("executiva")
                || classe.equalsIgnoreCase("primeira classe")) {
            this.classe = classe;
            return true;
        }
        return false;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public boolean setPoltrona(int poltrona) {
        if (poltrona > 0) {
            this.poltrona = poltrona;
            return true;
        }
        return false;
    }

    @Override
	public String cartaoDeEmbarque() {
	
	return "Passageiro: " + super.getNome() 
			+ ", Voo: " + super.getVoo()
			+ ", Com destino: " + super.getDestino()
			+ ", Poltrona: " + this.getPoltrona()
			+ ", Classe: " + this.getClasse();
    }

    @Override
    public String toString() {
        return super.toString() + ", Classe: " + classe + ", Poltrona: " + poltrona;
    }

}

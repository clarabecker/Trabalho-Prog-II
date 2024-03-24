//Clara dos Santos Becker e Erick Augusto Warmling
public class Sistema {
    public static void main (String[] args) {
        
        Aeroporto aeroporto1 = new Aeroporto ("Aeroporto Internacional Hercílio Luz", "Florianópolis", "SC", "Brasil");

        Aeronave aviao1 = new Aeronave("Azul", 174, "Airbus A320", 368);
        Aeronave aviao2 = new Aeronave("Emirates", 853, "Airbus A380", 419);
        
        Pessoa pessoa1 = new Passageiro("Erick Augusto Warmling", 19, "321.654.988-33", "AZU2831", "Rio de Janeiro", "Econômica", 33);
        Pessoa pessoa2 = new Passageiro("Clara dos Santos Becker", 20, "987654258-94", "AZU2831", "Rio de Janeiro", "Econômica", 15);
        Pessoa pessoa3 = new Passageiro("Fernanda Concon", 22, "456.178.921-66", "AZU2831", "Rio de Janeiro", "Econômica", 59);
        Piloto piloto1 = new Piloto("Pedro Alves Cabral", 40, "012.874.563-82", "AZU2831", "Rio de Janeiro", "88451");
        Pessoa pessoa4 = new Passageiro("Samara Silva", 23, "084.129;745-15", "EMI9845", "Dubai", "Premium", 149);
        Pessoa pessoa5 = new Passageiro("Dilmar Machado", 61, "481.658.973-99", "EMI9845", "Dubai", "Econômica", 486);
        Piloto piloto2 = new Piloto("Gustavo Jacinto", 38, "021.214.654-13", "EMI9845", "Dubai", "32108");

        aeroporto1.addAeronave(aviao1);
        aeroporto1.addAeronave(aviao2);

        aviao1.addPessoa(pessoa1);
        aviao1.addPessoa(pessoa2);
        aviao1.addPessoa(pessoa3);
        aviao1.addPessoa(piloto1);
        aviao2.addPessoa(pessoa4);
        aviao2.addPessoa(pessoa5);
        aviao2.addPessoa(piloto2);

        System.out.println(aeroporto1.toString());
        aeroporto1.imprimirAeronaves();
        
        System.out.println(aviao1.toString());
        aviao1.imprimirQuantidadePessoas("AZU2831");
        aviao1.imprimirPassageiros();

        aviao1.removerPessoa("Fernanda Concon");
        aviao1.imprimirPassageiros();

        aeroporto1.removerAeronave(368);
        aeroporto1.imprimirAeronaves();

        aeroporto1.imprimirAeronaves("Emirates");
        aviao2.imprimirQuantidadePessoas("EMI9845");
        aviao2.imprimirPassageiros();

        System.out.println(pessoa1.cartaoDeEmbarque());
        System.out.println(piloto1.cartaoDeEmbarque());
        
        System.out.println(piloto2.calcularValorVoo(36, 150));
        

    }
}

/*

/*
	 * Pais

	 Escreva uma classe que represente um país. Um país tem como atributos o seu nomePais,
	 o nomePais da nomeCapital, sua dimensão em Km2 e uma lista de países com os quais ele faz
	 fronteira. Represente a classe e forneça os seguintes construtores e método:

	 
	 */
public class Pais {
    private String nomePais;
    private String nomeCapital;
    private double territorio;
    private Pais[] fronteiras;

    // a) Construtor que inicialize o nomePais, nomeCapital e a dimensão do país;
    public Pais(String nome, String capital, double dimensao) {
        this.nomePais = nome;
        this.nomeCapital = capital;
        this.territorio = dimensao;
    }

    //  c) Um método que permita verificar se dois países são iguais. Dois países são iguais se tiverem mesmo nomePais e a mesma nomeCapital. A assinatura deste método deve ser:
    public boolean equals(final Pais outro) {
    return this.nomePais.equals(outro.getNome())
                && this.nomeCapital.equals(outro.getCapital());
    }

    // d) Um método que define quais outros países fazem fronteira (note que um país não pode fazer fronteira com ele mesmo);
    public void setFronteiras(Pais... paises) {

        int qtdePaisesIguais = 0;
        for(int i = 0; i < paises.length; i++) {
            if(this.equals(paises[i])) {
                qtdePaisesIguais++;
            }
        }

        this.fronteiras = new Pais[paises.length - qtdePaisesIguais];
        int idxFronteira = 0;
        for(int i = 0; i < paises.length; i++) {
            if(!this.equals(paises[i])) {
                this.fronteiras[idxFronteira] = paises[i];
                idxFronteira++;
            }
        }

    }

    // e) Um método que retorne a lista de países que fazem fronteira;
    public Pais[] getFronteiras() {
        return this.fronteiras;
    }

    // f) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos comuns aos dois países.
    public Pais[] paisesEmComum(Pais outro) {
        int totaisDeIguais = 0;
        for(Pais fronteiraPais: this.fronteiras) {
            for(Pais fronteiraOutro: outro.fronteiras) {
                if(fronteiraPais.equals(fronteiraOutro)) {
                    totaisDeIguais++;
                }
            }
        }

        if(totaisDeIguais > 0) {
            int idxVizinhos = 0;
            Pais[] mesmosVizinhos = new Pais[totaisDeIguais];
            for(Pais fronteiraPais: this.fronteiras) {
                for(Pais fronteiraOutro: outro.fronteiras) {
                    if(fronteiraPais.equals(fronteiraOutro)) {
                        mesmosVizinhos[idxVizinhos] = fronteiraOutro;
                        idxVizinhos++;
                    }
                }
            }

            return mesmosVizinhos;
        }

        return null;
    }


    //b) Métodos de acesso (set/get) para as propriedades indicadas no item (a);
    public String getNome() {
        return nomePais;
    }

    public void setNome(String nome) {
        this.nomePais = nome;
    }

    public String getCapital() {
        return nomeCapital;
    }

    public void setCapital(String capital) {
        this.nomeCapital = capital;
    }

    public double getDimensao() {
        return territorio;
    }

    public void setDimensao(double dimensao) {
        this.territorio = dimensao;
    }

}
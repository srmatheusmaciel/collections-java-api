package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private int codigoConvite;
    private String nome;

    public Convidado(String nome,int codigoConvite ) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;

    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }



    @Override
    public String toString() {
        return "Convidado{" +
                "codigoConvite=" + codigoConvite +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }
}

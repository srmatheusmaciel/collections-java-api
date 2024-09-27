package main.list.Ordenacao;

import main.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>();

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        // Adicionando pessoas
        ordenacaoPessoas.adicionarPessoa("João Silva", 25, 1.78);
        ordenacaoPessoas.adicionarPessoa("Maria Oliveira", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("Pedro Santos", 22, 1.85);
        ordenacaoPessoas.adicionarPessoa("Ana Costa", 28, 1.70);
        ordenacaoPessoas.adicionarPessoa("Lucas Almeida", 35, 1.80);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }


}

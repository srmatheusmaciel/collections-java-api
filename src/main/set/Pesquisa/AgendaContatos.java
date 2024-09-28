package main.set.Pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    private void adicionarContato(String nome, int telefone){

        contatoSet.add(new Contato(nome,telefone));

    }

    private void exibirContatos() {
        if(!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        }else{
            System.out.println("nenhum contato adicionado.");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){

            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }

        }

        return  contatosPorNome;
    }

    public Contato atualizarContatoPorNumero(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){

                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João Silva", 912345678);
        agendaContatos.adicionarContato("Maria Oliveira", 987654321);
        agendaContatos.adicionarContato("Carlos Pereira", 998877766);
        agendaContatos.adicionarContato("João Silva", 912345678);  // Repetição de nome
        agendaContatos.adicionarContato("Maria Oliveira", 987654321);  // Repetição de nome

        agendaContatos.exibirContatos();

        System.out.println("Resultado da pesquisa: " + agendaContatos.pesquisarPorNome("João"));
        System.out.println("Contato atualizado:" + agendaContatos.atualizarContatoPorNumero("Maria Oliveira",12355587));




    }


}

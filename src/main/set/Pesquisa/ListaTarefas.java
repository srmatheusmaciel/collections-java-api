package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){

        tarefaSet.add(new Tarefa(descricao));

    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        }else {
            System.out.println("Nenhuma tarefa adicionada");
        }
    }

    public void removerTarefas(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }

            tarefaSet.remove(tarefaParaRemover);

        } else{
            throw new RuntimeException("Sem tarefas pra remover");
        }


    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set <Tarefa> obtendoTarefasConcluidas = new HashSet<>();

        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.isTarefaConcluida()){
                    obtendoTarefasConcluidas.add(t);
                }
            }
        } return obtendoTarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> obtendoTarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isTarefaConcluida()){
                obtendoTarefasPendentes.add(t);
            }
        }
        return obtendoTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;

        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarComoPendente = t;
            }
            break;
        }

        if(tarefaParaMarcarComoPendente != null){
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()){
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista");
        }

    }

    public void limparListaTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("Lista já está vazia");
        } else {
            tarefaSet.clear();

        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefas("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}

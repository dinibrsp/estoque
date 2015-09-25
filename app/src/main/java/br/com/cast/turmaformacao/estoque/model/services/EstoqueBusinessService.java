package br.com.cast.turmaformacao.estoque.model.services;

import java.util.List;

import br.com.cast.turmaformacao.estoque.model.entities.Estoque;
import br.com.cast.turmaformacao.estoque.model.persistence.EstoqueReposiroty;

public final class EstoqueBusinessService {


    private EstoqueBusinessService(){
        super();
    }


    public static List<Estoque> findAll() {
        return EstoqueReposiroty.getAll();
    }

    public static void  save(Estoque estoque){
        EstoqueReposiroty.save(estoque);

    }

    public static void delete(Estoque selectedEstoque){
        EstoqueReposiroty.delete(selectedEstoque.getId());
    }
}

package br.edu.ifpb.mobiliaria.model.service;

import br.edu.ifpb.mobiliaria.model.entity.Produto;
import br.edu.ifpb.mobiliaria.model.repository.ProdutoIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoIF produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public void saveProduto(Produto newProduto){
        produtoRepository.save(newProduto);
    }

}

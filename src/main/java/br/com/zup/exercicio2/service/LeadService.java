package br.com.zup.exercicio2.service;

import br.com.zup.exercicio2.dtos.LeadDto;
import br.com.zup.exercicio2.dtos.ProdutoDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private List<LeadDto> leads = new ArrayList<>();


    public List<LeadDto> leadsCadastrados() {
        return leads;
    }

    public boolean leadCadastrado(LeadDto lead) {
        for (LeadDto referencia : leads) {
            if (referencia.getEmail().equals(lead.getEmail())) {
                return true;
            }
        }

        return false;
    }

    public boolean produtosDuplicados(LeadDto leadCadastrado, LeadDto leadNovo) {
        List<ProdutoDto> produtosCadastrados = leadCadastrado.getListaProdutos();
        List<ProdutoDto> produtosNovos = leadNovo.getListaProdutos();

        for (ProdutoDto referencia : produtosCadastrados) {
            if (produtosNovos.contains(referencia)) {
                return true;
            }
        }

        return false;
    }

    public void adicionarProdutos(LeadDto leadCadastrado, LeadDto leadNovo) {
        for (ProdutoDto referencia : leadNovo.getListaProdutos()) {
            leadCadastrado.adicionarProduto(referencia);
        }

    }

    public void cadastrarLead(@RequestBody LeadDto lead) {
        if (leadCadastrado(lead)) {
            for (LeadDto referencia : leads) {
                if (referencia.getEmail().equalsIgnoreCase(lead.getEmail())) {
                    if (produtosDuplicados(referencia, lead)) {
                        throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Produto já cadastrado para este email");
                    } else {
                        adicionarProdutos(referencia, lead);
                    }
                }
            }

        } else {
            leads.add(lead);

        }

    }

}

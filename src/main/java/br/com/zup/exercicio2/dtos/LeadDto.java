package br.com.zup.exercicio2.dtos;

import java.util.List;

public class LeadDto {

    private String email;
    private String nome;
    private String telefone;
    private List<ProdutoDto> listaProdutos;


    public LeadDto() {
    }

    public LeadDto(String email, String nome, String telefone, List<ProdutoDto> listaProdutos) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.listaProdutos = listaProdutos;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutoDto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoDto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }


    public void adicionarProduto(ProdutoDto produtoNovo){
        listaProdutos.add(produtoNovo);
    }

}

package br.com.zup.exercicio2.dtos;

public class ProdutoDto {

    private String nomeDoProduto;
    private double valorDoProduto;


    public ProdutoDto() {
    }

    public ProdutoDto(String nomeDoProduto, double valorDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorDoProduto = valorDoProduto;
    }


    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

}

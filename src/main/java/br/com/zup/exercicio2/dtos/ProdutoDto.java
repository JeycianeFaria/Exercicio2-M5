package br.com.zup.exercicio2.dtos;


import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoDto that = (ProdutoDto) o;
        return Double.compare(that.valorDoProduto, valorDoProduto) == 0 && Objects.equals(nomeDoProduto, that.nomeDoProduto);
    }

}

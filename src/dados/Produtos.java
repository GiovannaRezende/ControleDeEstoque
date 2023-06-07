package dados;

public class Produtos {
    private String produto;
    private String marca;
    private String medida;

    public Produtos() {
        
    }

    public void setCodigo(String produto) {
        this.produto = produto;
    }

    public void setNome(String marca) {
        this.marca = marca;
    }

    public void setCidade(String medida) {
        this.medida = medida;
    }


    public String getProduto() {
        return produto;
    }

    public String getMarca() {
        return marca;
    }

    public String getMedida() {
        return medida;
    }

}

package poo.fundamentos.produtoProva;

public class ProdutoPerecivel extends Produto{
    private int diasV;

    public ProdutoPerecivel(String codigo, String nome, int quantidade, int diasV){
        super(codigo, nome, quantidade);
        this.diasV = diasV;
    }

    public int getDiasV() {
        return diasV;
    }

    public void setDiasV(int diasV) {
        this.diasV = diasV;
    }

    @Override
    public void repor(int qnt) {
    }
     public void baixarTudo(){
        super.baixar(getQuantidade());
     }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dias de Validade: "+this.diasV);
    }
}


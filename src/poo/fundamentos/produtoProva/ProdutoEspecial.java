package poo.fundamentos.produtoProva;

public class ProdutoEspecial extends Produto{

    public ProdutoEspecial(String codigo, String nome, int quantidade){
        super(codigo,nome,quantidade);
    }

    @Override
    public void baixar(int qnt) {
        super.baixar(qnt + (qnt * (5/100)));
    }
}

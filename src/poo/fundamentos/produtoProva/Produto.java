package poo.fundamentos.produtoProva;

abstract public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;

    public Produto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(String codigo, String nome, int quantidade){
        this(codigo, nome);
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void repor(int qnt){
        this.quantidade += qnt;
    }

    public void baixar(int qnt){
        if (this.quantidade >= qnt){
            this.quantidade -= qnt;
        }else{
            System.out.println("Não foi possível, Estoque:"+this.quantidade);
        }
    }

    public void mostrarDados(){
        System.out.println("Código: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Nome: "+this.quantidade);
    }

}

package poo.fundamentos.produtoProva;

class MovimentoEstoque
{
    public static void main(String[] args) throws Exception
    {ProdutoEspecial pe = new ProdutoEspecial ("1","Tecido",60);
        ProdutoPerecivel pp = new ProdutoPerecivel ("2","Feijao",200, 10);
        System.out.println("Movimento Estoque");
        System.out.println("Valores iniciais");
        pe.mostrarDados();
        pp.mostrarDados();

        System.out.println("Reposicoes iniciais 100 e 100");
        pe.repor (100);
        pe.mostrarDados();
        pp.repor (100);
        pp.mostrarDados();

        System.out.println("Baixando 30 e 50");
        pe.baixar (30);
        pe.mostrarDados();
        pp.baixar (50);
        pp.mostrarDados();

        System.out.println("Baixando Tudo do Perecivel");
        pp.baixarTudo ();
        pp.mostrarDados();

        System.out.println("Baixando 10 do Perecivel");
        pp.baixar (10);
        pp.mostrarDados();
    }
}

package pacoteclasses;

public class Main {
    public static void main(String Args[]){
        Dono srPaulao = new Dono();
        Obra livro = new Obra();
        //srPaulao.cadastrarAvaliador(joao);
        Avaliador joao = new Avaliador();
        joao.setNome("Joao");
        joao.setCpf("32443254354");
        joao.setEndereco("Av Presidente Costa e Silva, Mossoro");
        joao.setObraParaAvaliar(livro);




        Autor jakeR = new Autor();
        jakeR.setNome("Jake Rowlling");
        jakeR.setEndereco("Algum lugar dos EUA");
        jakeR.setObra(livro);


        livro.setAvaliador(joao);
        livro.setTitulo("Harry Potter");
        livro.setGenero("ficcao");
        livro.setAutor(jakeR);
        livro.setAno(2002);

        jakeR.verObra(livro);


    }
}

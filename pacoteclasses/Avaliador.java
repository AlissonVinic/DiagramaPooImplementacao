package pacoteclasses;
public class Avaliador {
    private String nome;
    private String cpf;
    private String endereco;
    private Obra obraParaAvaliar;

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public Obra getObraParaAvaliar(){
        return obraParaAvaliar;
    }

    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Este campo pode ser vazio.");
        }else{
            this.nome = nome;
        }
    }
    public void setCpf(String cpf){
        if(cpf == null || cpf.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.cpf = cpf;
        }
    }
    public void setEndereco(String endereco){
        if(endereco == null || endereco.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.endereco = endereco;
        }
    }
    public void setObraParaAvaliar(Obra obraParaAvaliar){
        if(obraParaAvaliar == null){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.obraParaAvaliar = obraParaAvaliar;
        }
    }
    
    public void avaliarObra(String titulo, String comentario){
        System.out.println("Avaliando obra: " + titulo + "\n Comentário: " + comentario);
    }
}

package pacoteclasses;
public class Autor {
    private String nome;
    private String endereco;
    private String cpf;
    private Obra obra;
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public Obra getObra(){
        return obra;
    }
    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.nome = nome;
        }
    }
    public void setEndereco(String endereco){
        if(endereco == null || endereco.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.endereco = endereco;
        }
    }
    public void setCpf(String cpf){
        if(cpf == null || cpf.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.cpf = cpf;
        }
    }
    public void setObra(Obra obra){
        if(obra == null){
            System.out.println("Este campo não pode ser vazio.");
        }else{
            this.obra = obra;
        }
    }
    public void verObra(Obra obra){
        
            System.out.println("Título: " + obra.getTitulo());
            System.out.println("autor: " + obra.getAutor());
            System.out.println("Ano: " + obra.getAno());
            System.out.println("Genero: " + obra.getGenero());
            System.out.println("Status: " + obra.getStatus());
            System.out.println("");
    }
}
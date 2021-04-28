/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Aluno extends Pessoa {
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Aluno(String curso, double nota1, double nota2, double nota3, double media, String nom, String end, int tel, int cpf) {
        super(nom, end, tel, cpf);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public Aluno() {  }
    
    
    

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
     /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
    
    
    public void calculaMedia(){
        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média é: " + this.getMedia());
    }

   public void verificaAprovado(){
       if (media >= 7.0){
           System.out.println("Você foi Aprovado");          
       }
       else{
                   System.out.println("Reprovado");
                   }
   }

    @Override
    public void tirarCopia() {
        System.out.println("Você é aluno. Suas cópias custarão 0,10 centavos cada.");
    }

    @Override
    public void ExibeDados() {
       
        System.out.println("---- Dados do Aluno ----");
        System.out.println("Nome: " + getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Notas: \nNota1: "  + this.getNota1() + "\nNota2: " + this.getNota2()+ "\nNota3: " + this.getNota3() );
        
    }
}

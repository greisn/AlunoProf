/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Professor extends Pessoa {
    private String curso;
    private double salario;
    private double inss;
    private double ir;
    private double desconto;
    private double liquido;
    
    
    
    public Professor (String nom, String end, int tel, int cpf){
        super(nom, end, tel, cpf);
         
        
    }

    public Professor(String curso, double salario, double inss, double ir, double liquido, String nom, String end, int tel, int cpf, double desconto) {
        super(nom, end, tel, cpf);
        this.curso = curso;
        this.salario = salario;
        this.inss = inss;
        this.ir = ir;
        this.liquido = liquido;
        this.desconto = desconto;
    }

    public Professor() { }
    

           
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
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the inss
     */
    public double getInss() {
        return inss;
    }

    /**
     * @param inss the inss to set
     */
    public void setInss(double inss) {
        this.inss = inss;
    }

    /**
     * @return the ir
     */
    public double getIr() {
        return ir;
    }

    /**
     * @param ir the ir to set
     */
    public void setIr(double ir) {
        this.ir = ir;
    }
    
       /**
     * @return the liquido
     */
    public double getLiquido() {
        return liquido;
    }

    /**
     * @param liquido the liquido to set
     */
    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }
    
    
    public void calculaSalarioLiquido(){
       
       desconto = (ir - 9*salario)/100;
       liquido = salario - desconto;
       System.out.println("Valor do salário com desconto do INSS: " + this.getLiquido());
    }
    
   

    @Override
    public void tirarCopia() {
        System.out.println("Você é professor. Suas cópias custarão 0,05 centavos cada.");
        
    } 
    
    @Override
    public void ExibeDados() {
       
     
        System.out.println("---- Dados do Professor ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Cpf: " + getCpf());
       
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

 
        
}

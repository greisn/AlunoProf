/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TesteAlunoProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno alu = new Aluno();
        Professor prof = new Professor();
        
        alu.setNome("João");
        alu.setEndereco("Rua tal, nº tal");
        alu.setTelefone(2387909);
        alu.setCpf(87098789);
        alu.setCurso("Gestão de Tecnologia da Informação");
        alu.setNota1(8.90);
        alu.setNota2(6.30);
        alu.setNota3(3.20);
        
        prof.setNome("Marcelo");
        prof.setEndereco("Rua testando, nº 2");
        prof.setTelefone(84565468);
        prof.setCpf(286214924);
        prof.setCurso("Gestão de Tecnologia da Informação");
        prof.setSalario(5.500);
        prof.setIr(100);
        
        alu.ExibeDados();
        alu.calculaMedia();
        alu.verificaAprovado();
        alu.tirarCopia();
        
        System.out.println("                    ");
        
        prof.ExibeDados();
        prof.calculaSalarioLiquido();
        prof.tirarCopia();
       
              
    }
    
}
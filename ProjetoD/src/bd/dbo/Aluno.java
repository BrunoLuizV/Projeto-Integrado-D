/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.dbo;

/**
 *
 * @author bruno
 */
public class Aluno {
    public String nome;
    public String email;
    public int matricula;
    public int cpf;
    public int telefone;
    
    
    public String getNome()
    {
       return nome = nome;
    }
    
    public void setNome(String nome) throws Exception
    {
        if(nome==null || nome.equals(""))
            throw new Exception ("O nome não pode ficar valido");
        this.nome = nome;
    }
    
    public String getEmail()
    {
        return email = email;
    }
    
    public void setEmail(String email) throws Exception
    {
        if(email==null || email.equals(""))
            throw new Exception ("Por favor inserir um e-mail valido!");
            this.email = email;
    }
    
    public int getMatricula()
    {
        return matricula;
    }
    
    public void setMatricula(int Matricula)
    {
        this.matricula = matricula;
    }
    
    public int getCpf()
    {
        return cpf;
    }
    
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
    
    public int getTelefone()
    {
        return telefone;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
}

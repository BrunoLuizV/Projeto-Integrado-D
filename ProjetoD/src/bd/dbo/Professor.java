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
public class Professor {
    
    public int Id_Professor;
    public String nome;
    public String modalidade;
    public int telefone;
    public String email;
    
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome) throws Exception
    {
        if(nome==null || nome.equals(""))
            throw new Exception("O nome não pode ficar em branco!");
            this.nome = nome;
    }
    
    public String getModalidade()
    {
        return modalidade;
    }
    
    public void setModalidade(String modalidade) throws Exception
    {
        if(modalidade==null || modalidade.equals(""))
            throw new Exception ("A modalidade do professor está invalida/nula!");
        this.modalidade = modalidade;
            
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email) throws Exception
    {
        if(email==null || nome.equals(""))
            throw new Exception ("Insira um e-mail valido!");
        this.email = email;
    }
    
    public int getTelefone()
    {
        return telefone;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public int getId_Professor()
    {
        return Id_Professor;
    }
    
    public void setId_Professor(int Id_Professor)
    {
        this.Id_Professor = Id_Professor;
    }
}

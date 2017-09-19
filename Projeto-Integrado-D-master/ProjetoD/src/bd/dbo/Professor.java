/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.dbo;

import java.util.Objects;

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

    public Professor(int Id_Professor, String nome, String modalidade, int telefone, String email) {
        this.Id_Professor = Id_Professor;
        this.nome = nome;
        this.modalidade = modalidade;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.Id_Professor;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.modalidade);
        hash = 89 * hash + this.telefone;
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (this.Id_Professor != other.Id_Professor) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.modalidade, other.modalidade)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "Id_Professor=" + Id_Professor + ", nome=" + nome + ", modalidade=" + modalidade + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}

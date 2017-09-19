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

    public Aluno(String nome, String email, int matricula, int cpf, int telefone) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.email);
        hash = 43 * hash + this.matricula;
        hash = 43 * hash + this.cpf;
        hash = 43 * hash + this.telefone;
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
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", matricula=" + matricula + ", cpf=" + cpf + ", telefone=" + telefone + '}';
    }
    
    
}

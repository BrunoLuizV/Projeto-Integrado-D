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
public class Plano {
    
    public float preco;
    public String nome;
    public int id;
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome) throws Exception
    {
        if(nome==null || nome.equals(""))
            throw new Exception("O nome do plano está invalido.");
        this.nome = nome;
    }
    
    public float getPreco()
    {
        return preco;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public Plano(float preco, String nome, int id) {
        this.preco = preco;
        this.nome = nome;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Float.floatToIntBits(this.preco);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.id;
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
        final Plano other = (Plano) obj;
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plano{" + "preco=" + preco + ", nome=" + nome + ", id=" + id + '}';
    }
    
    
}

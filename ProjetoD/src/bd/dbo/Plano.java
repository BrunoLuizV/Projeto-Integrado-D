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
}

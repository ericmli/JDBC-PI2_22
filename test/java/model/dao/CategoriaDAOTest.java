/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model.dao;

import model.bean.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author erics
 */
public class CategoriaDAOTest {
    
    public CategoriaDAOTest() {
    }

    @Test
    public void inserir() {
        
        Categoria cat = new Categoria("Roupas");
        CategoriaDAO dao = new CategoriaDAO();
        
        
        if(dao.save(cat)){
            System.err.println("Salvo com sucesso!");
        }
        else{
            fail("Erro ao salvar");
        }
    }
    
}

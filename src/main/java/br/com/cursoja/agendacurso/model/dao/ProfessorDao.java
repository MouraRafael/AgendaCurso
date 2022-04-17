package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.cursoja.agendacurso.entidade.Professor;

public class ProfessorDao extends Conexao{
    //Cadastrar
    public void cadastrar(Professor p){
        String sql = "Insert INTO Professor"
        		+ "(nome, celular, valorhora)"
        		+ "VALUES (?,?,?)";

        try{

            PreparedStatement ps = getConexao().prepareStatement(sql);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getCelular());
            ps.setDouble(3, p.getValorHora());

            ps.execute();

        }catch(SQLException e){
            System.out.println("Erro de Cadastro");
            e.printStackTrace();
        }finally{
            fecharConexao();
        }

    }

    // busca por id
    public Professor buscar (long idbusca){
        Professor prof = null;

        String sql = "SELECT idprofessor, nome, celular, valorhora FROM professor"
                        +" WHERE idprofessor = ?";

        try{
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setLong(1,idbusca);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                prof = new Professor();
                prof.setId(rs.getLong("idprofessor"));
                prof.setNome(rs.getString("nome"));
                prof.setCelular(rs.getString("celular"));
                prof.setValorHora(rs.getDouble("valorhora"));
            }

        }catch(SQLException e){
            System.out.println("Erro ao listar");
            
        }finally{
            fecharConexao();
        }




        return prof;
    }


    
}

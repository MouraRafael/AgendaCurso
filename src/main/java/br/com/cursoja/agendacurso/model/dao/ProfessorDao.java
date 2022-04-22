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

    //buscageral R
    public ArrayList<Professor> listar (String nomebusca){
        ArrayList<Professor> listaprof = new ArrayList<Professor>();

        String sql =    "SELECT idprofessor, nome, celular, valorhora FROM professor"
                        +" WHERE nome LIKE ?";

        try{

            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setString(1, "%"+nomebusca+"%");

            ResultSet rs = ps.executeQuery();

            Professor prof;

            while(rs.next()){
                prof = new Professor();
                prof.setId(rs.getLong("idprofessor"));
                prof.setNome(rs.getString("nome"));
                prof.setCelular(rs.getString("celular"));
                prof.setValorHora(rs.getDouble("valorhora"));

                listaprof.add(prof);
            }

        }catch( SQLException e){
            System.out.println("Erro de Listagem");
        }finally{
            fecharConexao();
        }
        

        return listaprof;
    }

    // Update U
    public void alterar (Professor p){
        String sql = "UPDATE professor SET "
                        +"nome = ?, "
                        +"celular = ?, "
                        +"valorhora = ? "
                        +"WHERE idprofessor = ? ";

        try{
            PreparedStatement ps = getConexao().prepareStatement(sql);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getCelular());
            ps.setDouble(3, p.getValorHora());
            ps.setLong(4, p.getId());

            ps.execute();

        }catch(SQLException e){
            System.out.println("Erro ao atualizar os dados");
            e.printStackTrace();
        }finally{
            fecharConexao();
        }
    }
    
}

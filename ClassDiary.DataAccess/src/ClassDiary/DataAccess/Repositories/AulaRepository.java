package ClassDiary.DataAccess.Repositories;

import ClassDiary.Common.Services.Result;
import ClassDiary.DataAccess.Core.IRepositoryBase;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Aula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AulaRepository implements IRepositoryBase<Aula>
{
    ManageDB Context = new ManageDB(0);
    
    @Override
    public Aula Get(int Id) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Aula e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_class, "
                    + "usuario_id, "
                    + "id_disciplina, "
                    + "periodo, "
                    + "unidadeDeAprendizagem, "
                    + "conteudoSagah, "
                    + "conteudoDesenvolvido, "
                    + "linkDaAulaGravada "
                    + "FROM aula "
                    + "WHERE id_class = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Aula();
                
                e.setId(result.getInt("id_class"));
                e.setUsuarioId(result.getInt("usuario_id"));
                e.setDisciplinaId(result.getInt("id_disciplina"));
                e.setPeriodo(result.getString("periodo"));
                e.setUnidadeDeAprendizagem(result.getString("unidadeDeAprendizagem"));
                e.setConteudoSagah(result.getBoolean("conteudoSagah"));
                e.setConteudoDesenvolvido(result.getString("conteudoDesenvolvido"));
                e.setLinkDaAulaGravada(result.getString("linkDaAulaGravada"));
            }
            
            Context.CloseConnection(conn, stmt, result);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return e;
    }

    @Override
    public List<Aula> GetAll() 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Aula> es ;
        es = new ArrayList<>();
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_class, "
                    + "usuario_id, "
                    + "id_disciplina, "
                    + "periodo, "
                    + "unidadeDeAprendizagem, "
                    + "conteudoSagah, "
                    + "conteudoDesenvolvido, "
                    + "linkDaAulaGravada "
                    + "FROM aula ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Aula e = new Aula();
                
                e.setId(result.getInt("id_class"));
                e.setUsuarioId(result.getInt("usuario_id"));
                e.setDisciplinaId(result.getInt("id_disciplina"));
                e.setPeriodo(result.getString("periodo"));
                e.setUnidadeDeAprendizagem(result.getString("unidadeDeAprendizagem"));
                e.setConteudoSagah(result.getBoolean("conteudoSagah"));
                e.setConteudoDesenvolvido(result.getString("conteudoDesenvolvido"));
                e.setLinkDaAulaGravada(result.getString("linkDaAulaGravada"));
                
                es.add(e);
            }
            
            Context.CloseConnection(conn, stmt, result);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return es;
    }

    @Override
    public Result Add(Aula e) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        boolean result = false;
        
        try 
        {
            stmt = conn.prepareStatement("INSERT INTO aula "
                    + "(usuario_id, "
                    + "id_disciplina, "
                    + "periodo, "
                    + "unidadeDeAprendizagem, "
                    + "conteudoSagah, "
                    + "conteudoDesenvolvido, "
                    + "linkDaAulaGravada) "
                    + "VALUES(?,?,?,?,?,?,?) ");
            stmt.setInt(1, e.getUsuarioId());
            stmt.setInt(2, e.getDisciplinaId());
            stmt.setString(3, e.getPeriodo());
            stmt.setString(4, e.getUnidadeDeAprendizagem());
            stmt.setBoolean(5, e.isConteudoSagah());
            stmt.setString(6, e.getConteudoDesenvolvido());
            stmt.setString(7, e.getLinkDaAulaGravada());
            
            result = stmt.execute();
            
            Context.CloseConnection(conn, stmt);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result ? Result.Sucesso : Result.Erro;
    }

    @Override
    public Result Update(Aula e) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        boolean result = false;
        
        try 
        {
            stmt = conn.prepareStatement("UPDATE aula SET "
                    + "usuario_id = ?, "
                    + "id_disciplina = ?, "
                    + "periodo = ?, "
                    + "unidadeDeAprendizagem = ?, "
                    + "conteudoSagah = ?, "
                    + "conteudoDesenvolvido = ?, "
                    + "linkDaAulaGravada = ? "
                    + "WHERE id_class = ? ");
            stmt.setInt(1, e.getUsuarioId());
            stmt.setInt(2, e.getDisciplinaId());
            stmt.setString(3, e.getPeriodo());
            stmt.setString(4, e.getUnidadeDeAprendizagem());
            stmt.setBoolean(5, e.isConteudoSagah());
            stmt.setString(6, e.getConteudoDesenvolvido());
            stmt.setString(7, e.getLinkDaAulaGravada());
            stmt.setInt(8, e.getId());
            
            result = stmt.execute();
            
            Context.CloseConnection(conn, stmt);
            return Result.Sucesso;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
            return Result.Erro;
        }
        
    }

    @Override
    public Result Remove(int Id) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        boolean result = false;
        
        try 
        {
            stmt = conn.prepareStatement("DELETE FROM aula "
                    + "WHERE id_class = ?");
            stmt.setInt(1, Id);
            
            result = stmt.execute();
            
            Context.CloseConnection(conn, stmt);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result ? Result.Sucesso : Result.Erro;
    }
    
}

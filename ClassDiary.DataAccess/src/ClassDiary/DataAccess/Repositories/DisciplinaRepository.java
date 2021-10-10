package ClassDiary.DataAccess.Repositories;

import ClassDiary.DataAccess.Core.IRepositoryBaseReadOnly;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DisciplinaRepository implements IRepositoryBaseReadOnly<Disciplina>
{
    ManageDB Context = new ManageDB();
    
    @Override
    public Disciplina Get(int Id) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Disciplina e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_disciplina, "
                    + "nome_disciplina, "
                    + "FROM Disciplina "
                    + "WHERE id_disciplina = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Disciplina();
                
                e.setId(result.getInt("id_disciplina"));
                e.setNome(result.getString("nome_disciplina"));
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
    public List<Disciplina> GetAll() 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Disciplina> es = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_disciplina, "
                    + "nome_disciplina, "
                    + "FROM Disciplina ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Disciplina e = new Disciplina();
                
                e.setId(result.getInt("id_disciplina"));
                e.setNome(result.getString("nome_disciplina"));
                
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
    
}

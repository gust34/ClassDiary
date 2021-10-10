package ClassDiary.DataAccess.Repositories;

import ClassDiary.DataAccess.Core.IRepositoryBaseReadOnly;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CursoRepository implements IRepositoryBaseReadOnly<Curso>
{
    ManageDB Context = new ManageDB();
    DisciplinaRepository repo = new DisciplinaRepository();
    
    @Override
    public Curso Get(int Id) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Curso e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_curso, "
                    + "nome_curso, "
                    + "FROM Curso "
                    + "WHERE id_curso = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Curso();
                
                e.setId(result.getInt("id_curso"));
                e.setNome(result.getString("nome_curso"));
                e.setDisciplinas(repo.GetByCurso(e.getId()));
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
    public List<Curso> GetAll() 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Curso> es = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_curso, "
                    + "nome_curso, "
                    + "FROM Curso ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Curso e = new Curso();
                
                e.setId(result.getInt("id_curso"));
                e.setNome(result.getString("nome_curso"));
                e.setDisciplinas(repo.GetByCurso(e.getId()));
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

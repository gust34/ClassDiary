package ClassDiary.DataAccess.Repositories;

import ClassDiary.DataAccess.Core.IRepositoryBaseReadOnly;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DisciplinaRepository implements IRepositoryBaseReadOnly<Disciplina>
{
    ManageDB Context = new ManageDB(0);
    CursoRepository repo;
    
    @Override
    public Disciplina Get(int Id) 
    {
        repo = new CursoRepository();
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Disciplina e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_disciplina, "
                    + "nome_disciplina,"
                    + "id_curso,"
                    + "semestre "
                    + "FROM disciplina "
                    + "WHERE id_disciplina = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Disciplina();
                
                e.setId(result.getInt("id_disciplina"));
                e.setNome(result.getString("nome_disciplina"));
                e.setIdCurso(result.getInt("id_curso"));
                e.setSemestre(result.getInt("semestre"));
                e.setCurso(repo.Get(e.getIdCurso()));
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
        repo = new CursoRepository();
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        ArrayList<Disciplina> es;
        es = new ArrayList<>();
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_disciplina, "
                    + "nome_disciplina,"
                    + "id_curso, "
                    + "semestre "
                    + "FROM disciplina ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Disciplina e = new Disciplina();
                
                e.setId(result.getInt("id_disciplina"));
                e.setNome(result.getString("nome_disciplina"));
                e.setIdCurso(result.getInt("id_curso"));
                e.setSemestre(result.getInt("semestre"));
                e.setCurso(repo.Get(e.getIdCurso()));
                
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
    
    public List<Disciplina> GetByCurso(int cursoId) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        ArrayList<Disciplina> es;
        es = new ArrayList<>();
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_disciplina, "
                    + "nome_disciplina,"
                    + "id_curso,"
                    + "semestre "
                    + "FROM disciplina "
                    + "WHERE id_curso = ?");
            stmt.setInt(1, cursoId);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Disciplina e = new Disciplina();
                
                e.setId(result.getInt("id_disciplina"));
                e.setNome(result.getString("nome_disciplina"));
                e.setIdCurso(result.getInt("id_curso"));
                e.setSemestre(result.getInt("semestre"));
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

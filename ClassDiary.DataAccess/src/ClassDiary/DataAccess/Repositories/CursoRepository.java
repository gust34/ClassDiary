package ClassDiary.DataAccess.Repositories;

import ClassDiary.DataAccess.Core.IRepositoryBaseReadOnly;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CursoRepository implements IRepositoryBaseReadOnly<Curso>
{
    ManageDB Context = new ManageDB();
    DisciplinaRepository repo;
    
    @Override
    public Curso Get(int Id) 
    {
        repo = new DisciplinaRepository();
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Curso e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_curso, "
                    + "nome_curso, "
                    + "qtd_semestres "
                    + "FROM curso "
                    + "WHERE id_curso = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Curso();
                
                e.setId(result.getInt("id_curso"));
                e.setNome(result.getString("nome_curso"));
                e.setQtdSemestre(result.getInt("qtd_semestres"));
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
        repo = new DisciplinaRepository();
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Curso> es;
        es = new ArrayList<>();
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "id_curso, "
                    + "nome_curso, "
                    + "qtd_semestres "
                    + "FROM curso ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Curso e = new Curso();
                
                e.setId(result.getInt("id_curso"));
                e.setNome(result.getString("nome_curso"));
                e.setQtdSemestre(result.getInt("qtd_semestres"));
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

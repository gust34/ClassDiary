package ClassDiary.DataAccess.Repositories;

import ClassDiary.DataAccess.Core.IRepositoryBaseReadOnly;
import ClassDiary.DataAccess.Core.ManageDB;
import ClassDiary.Domain.DTO.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioRepository implements IRepositoryBaseReadOnly<Usuario>
{
    ManageDB Context;
    DisciplinaRepository repo;
    
    public UsuarioRepository()
    {
        Context = new ManageDB();
        repo = new DisciplinaRepository();
    }
    
    @Override
    public Usuario Get(int Id) 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Usuario e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "Id, "
                    + "NomeCompleto, "
                    + "Telefone, "
                    + "Email, "
                    + "NomeLogin, "
                    + "Senha, "
                    + "Cargo, "
                    + "PostoTrabalho "
                    + "FROM usuarios "
                    + "WHERE Id = ?");
            stmt.setInt(1, Id);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Usuario();
                
                e.setId(result.getInt("Id"));
                e.setNomeCompleto(result.getString("NomeCompleto"));
                e.setTelefone(result.getString("Telefone"));
                e.setEmail(result.getString("Email"));
                e.setNomeLogin(result.getString("NomeLogin"));
                e.setSenha(result.getString("Senha"));
                e.setCargo(result.getString("Cargo"));
                e.setPostoTrabalho(result.getString("PostoTrabalho"));
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
    public List<Usuario> GetAll() 
    {
        Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Usuario> es = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "Id, "
                    + "NomeCompleto, "
                    + "Telefone, "
                    + "Email, "
                    + "NomeLogin, "
                    + "Senha, "
                    + "Cargo, "
                    + "PostoTrabalho "
                    + "FROM usuarios ");
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                Usuario e = new Usuario();
                
                e.setId(result.getInt("Id"));
                e.setNomeCompleto(result.getString("NomeCompleto"));
                e.setTelefone(result.getString("Telefone"));
                e.setEmail(result.getString("Email"));
                e.setNomeLogin(result.getString("NomeLogin"));
                e.setSenha(result.getString("Senha"));
                e.setCargo(result.getString("Cargo"));
                e.setPostoTrabalho(result.getString("PostoTrabalho"));
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
    
    public Usuario GetByLogin(String Login, String Senha)
    {
    Connection conn = Context.GetConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Usuario e = null;
        
        try 
        {
            stmt = conn.prepareStatement("SELECT "
                    + "Id, "
                    + "NomeCompleto, "
                    + "Telefone, "
                    + "Email, "
                    + "NomeLogin, "
                    + "Senha, "
                    + "Cargo, "
                    + "PostoTrabalho "
                    + "FROM usuarios "
                    + "WHERE NomeLogin = ? AND Senha = ?");
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            
            result = stmt.executeQuery();
            
            while(result.next())
            {
                e = new Usuario();
                
                e.setId(result.getInt("Id"));
                e.setNomeCompleto(result.getString("NomeCompleto"));
                e.setTelefone(result.getString("Telefone"));
                e.setEmail(result.getString("Email"));
                e.setNomeLogin(result.getString("NomeLogin"));
                e.setSenha(result.getString("Senha"));
                e.setCargo(result.getString("Cargo"));
                e.setPostoTrabalho(result.getString("PostoTrabalho"));
            }
            
            Context.CloseConnection(conn, stmt, result);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AulaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return e;
    }
    
}

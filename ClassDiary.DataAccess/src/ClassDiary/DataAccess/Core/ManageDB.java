package ClassDiary.DataAccess.Core;

import ClassDiary.Common.Services.ConfigReader;
import ClassDiary.Common.Services.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManageDB 
{
    private final String Driver;
    private final String Url;
    private final String User;
    private final String Pass;
    
    public ManageDB(int DB)
    {
        List<Config> AppConfig = ConfigReader.GetAppConfig();
        Driver = "com.mysql.jdbc.Driver";
        if(DB == 1)
        {
            Url = "jdbc:mysql://campossalles.mysql.uhserver.com/campossalles";
            User = "registrousuario";
            Pass = "@User20212";
        }
        else
        {
            Url = "jdbc:mysql://planoensino.mysql.uhserver.com/planoensino";
            User = "professorescola";
            Pass = "@Rescolar2021";
        }
    }
    
    public Connection GetConnection()
    {
        try 
        {
            Class.forName(Driver);
            
            return DriverManager.getConnection(Url, User, Pass);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(ManageDB.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro de conexão",ex);
        }
    }
    
    public void CloseConnection(Connection conn)
    {
        if(conn != null)
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ManageDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CloseConnection(Connection conn, PreparedStatement stmt)
    {
        CloseConnection(conn);
        if(stmt != null)
        {
            try 
            {
                stmt.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ManageDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CloseConnection(Connection conn, PreparedStatement stmt, ResultSet result)
    {
        CloseConnection(conn, stmt);
        if(result != null)
        {
            try 
            {
                result.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ManageDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

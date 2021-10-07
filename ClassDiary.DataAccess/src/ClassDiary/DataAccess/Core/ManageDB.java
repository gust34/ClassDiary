package ClassDiary.DataAccess.Core;

import ClassDiary.Common.Services.ConfigReader;
import ClassDiary.Common.Services.Config;
import java.sql.Connection;
import java.sql.DriverManager;
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
    
    public ManageDB()
    {
        List<Config> AppConfig = ConfigReader.GetAppConfig();
        Driver = AppConfig.stream().filter(x -> "Drive".equals(x.getKey())).findAny().orElse(new Config()).getValue();
        Url = AppConfig.stream().filter(x -> "Url".equals(x.getKey())).findAny().orElse(new Config()).getValue();
        User = AppConfig.stream().filter(x -> "User".equals(x.getKey())).findAny().orElse(new Config()).getValue();
        Pass = AppConfig.stream().filter(x -> "Pass".equals(x.getKey())).findAny().orElse(new Config()).getValue();
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
}

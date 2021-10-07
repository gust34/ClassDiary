package ClassDiary.DataAccess.Core;

import ClassDiary.Common.Services.ConfigReader;
import ClassDiary.Domain.DTO.Config;
import java.util.List;

public class ManageDB 
{
    private String Drive;
    private String Url;
    private String User;
    private String Pass;
    
    public ManageDB()
    {
        List<Config> AppConfig = ConfigReader.GetAppConfig();
    }
}

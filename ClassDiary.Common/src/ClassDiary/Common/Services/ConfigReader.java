package ClassDiary.Common.Services;

import com.google.gson.Gson;
import java.util.List;
import ClassDiary.Domain.DTO.Config;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ConfigReader 
{
    static Gson gson = new Gson();
    
    public static List<Config> GetAppConfig()
    {
        String json = "";
        
        Type listType = new TypeToken<ArrayList<Config>>(){}.getType();
        List<Config> AppConfig = gson.fromJson(json, listType);
        
        return AppConfig;
    }
}

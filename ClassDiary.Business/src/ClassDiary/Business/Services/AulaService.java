package ClassDiary.Business.Services;

import ClassDiary.Common.Services.Result;
import ClassDiary.DataAccess.Repositories.AulaRepository;
import ClassDiary.Domain.DTO.Aula;
import java.util.List;

public class AulaService 
{
    AulaRepository repo;
    
    public AulaService()
    {
        repo = new AulaRepository();
    }
    
    public Result Inserir(Aula e)
    {
        return repo.Add(e);
    }
    
    public List<Aula> GetAll()
    {
        return repo.GetAll();
    }
}

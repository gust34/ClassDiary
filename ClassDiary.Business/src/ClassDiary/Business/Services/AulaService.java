package ClassDiary.Business.Services;

import ClassDiary.Common.Services.Result;
import ClassDiary.DataAccess.Repositories.AulaRepository;
import ClassDiary.Domain.DTO.Aula;

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
}

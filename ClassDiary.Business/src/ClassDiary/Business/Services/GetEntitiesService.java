package ClassDiary.Business.Services;

import ClassDiary.DataAccess.Repositories.CursoRepository;
import ClassDiary.DataAccess.Repositories.DisciplinaRepository;
import ClassDiary.Domain.DTO.Curso;
import java.util.List;

public class GetEntitiesService 
{
    DisciplinaRepository disciplinaRepo;
    CursoRepository cursoRepo;
    
    public GetEntitiesService()
    {
        disciplinaRepo = new DisciplinaRepository();
        cursoRepo = new CursoRepository();
    }
    
    public List<Curso> GetCursos()
    {
        return cursoRepo.GetAll();
    }
}

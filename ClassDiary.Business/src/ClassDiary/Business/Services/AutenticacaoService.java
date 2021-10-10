package ClassDiary.Business.Services;

import ClassDiary.DataAccess.Repositories.UsuarioRepository;
import ClassDiary.Domain.DTO.Usuario;

public class AutenticacaoService 
{
    UsuarioRepository repo = new UsuarioRepository();
    
    public Usuario Logar(String Login, String Senha)
    {
        return repo.GetByLogin(Login, Senha);
    }
}

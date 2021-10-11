package ClassDiary.Business.Services;

import ClassDiary.DataAccess.Repositories.UsuarioRepository;
import ClassDiary.Domain.DTO.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class AutenticacaoService 
{
    UsuarioRepository repo;
    
    public AutenticacaoService()
    {
        repo = new UsuarioRepository();
    }
    
    public Usuario Logar(String Login, String Senha)
    {
        return repo.GetByLogin(Login, Senha);
    } 
    
    public String Criptografar(String Senha) throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
       MessageDigest algorithm = MessageDigest.getInstance("MD5");
       byte messageDigest[] = algorithm.digest(Senha.getBytes("UTF-8"));
       
       return Arrays.toString(messageDigest);
    }
}

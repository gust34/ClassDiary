package ClassDiary.Domain.DTO;

public class Disciplina 
{
    private int _id;
    private String _nome;
    private int _idCurso;
    private Curso _curso;
    
    /**
     * @return the _idCurso
     */
    public int getIdCurso() {
        return _idCurso;
    }

    /**
     * @param _idCurso the _idCurso to set
     */
    public void setIdCurso(int _idCurso) {
        this._idCurso = _idCurso;
    }

    /**
     * @return the _curso
     */
    public Curso getCurso() {
        return _curso;
    }

    /**
     * @param _curso the _curso to set
     */
    public void setCurso(Curso _curso) {
        this._curso = _curso;
    }
    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _nome
     */
    public String getNome() {
        return _nome;
    }

    /**
     * @param _nome the _nome to set
     */
    public void setNome(String _nome) {
        this._nome = _nome;
    }
    
    @Override
    public String toString()
    {
        return getNome();
    }
}

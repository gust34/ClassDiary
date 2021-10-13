package ClassDiary.Domain.DTO;

import java.util.List;

public class Curso 
{
    private int _id;
    private String _nome;
    private List<Disciplina> _disciplinas;

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

    /**
     * @return the _disciplinas
     */
    public List<Disciplina> getDisciplinas() {
        return _disciplinas;
    }

    /**
     * @param _disciplinas the _disciplinas to set
     */
    public void setDisciplinas(List<Disciplina> _disciplinas) {
        this._disciplinas = _disciplinas;
    }
    
    @Override
    public String toString()
    {
        return getNome();
    }
}

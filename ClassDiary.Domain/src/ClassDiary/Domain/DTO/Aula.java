package ClassDiary.Domain.DTO;

import java.util.Date;

public class Aula 
{
    private int _id;
    private int _usuarioId;
    private Usuario _usuario;
    private int _cursoId;
    private Curso _curso;
    private int _semestre;
    private int _disciplinaId;
    private String _periodo;
    private String _unidadeDeAprendizagem;
    private boolean _conteudoSagah;
    private String _conteudoDesenvolvido;
    private String _linkDaAulaGravada;
    private Date _data;

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
     * @return the _usuarioId
     */
    public int getUsuarioId() {
        return _usuarioId;
    }

    /**
     * @param _usuarioId the _usuarioId to set
     */
    public void setUsuarioId(int _usuarioId) {
        this._usuarioId = _usuarioId;
    }

    /**
     * @return the _usuario
     */
    public Usuario getUsuario() {
        return _usuario;
    }

    /**
     * @return the _cursoId
     */
    public int getCursoId() {
        return _cursoId;
    }

    /**
     * @param _cursoId the _cursoId to set
     */
    public void setCursoId(int _cursoId) {
        this._cursoId = _cursoId;
    }

    /**
     * @return the _curso
     */
    public Curso getCurso() {
        return _curso;
    }

    /**
     * @return the _semestre
     */
    public int getSemestre() {
        return _semestre;
    }

    /**
     * @param _semestre the _semestre to set
     */
    public void setSemestre(int _semestre) {
        this._semestre = _semestre;
    }

    /**
     * @return the _disciplinaId
     */
    public int getDisciplinaId() {
        return _disciplinaId;
    }

    /**
     * @param _disciplinaId the _disciplinaId to set
     */
    public void setDisciplinaId(int _disciplinaId) {
        this._disciplinaId = _disciplinaId;
    }

    /**
     * @return the _periodo
     */
    public String getPeriodo() {
        return _periodo;
    }

    /**
     * @param _periodo the _periodo to set
     */
    public void setPeriodo(String _periodo) {
        this._periodo = _periodo;
    }

    /**
     * @return the _unidadeDeAprendizagem
     */
    public String getUnidadeDeAprendizagem() {
        return _unidadeDeAprendizagem;
    }

    /**
     * @param _unidadeDeAprendizagem the _unidadeDeAprendizagem to set
     */
    public void setUnidadeDeAprendizagem(String _unidadeDeAprendizagem) {
        this._unidadeDeAprendizagem = _unidadeDeAprendizagem;
    }

    /**
     * @return the _conteudoSagah
     */
    public boolean isConteudoSagah() {
        return _conteudoSagah;
    }

    /**
     * @param _conteudoSagah the _conteudoSagah to set
     */
    public void setConteudoSagah(boolean _conteudoSagah) {
        this._conteudoSagah = _conteudoSagah;
    }

    /**
     * @return the _conteudoDesenvolvido
     */
    public String getConteudoDesenvolvido() {
        return _conteudoDesenvolvido;
    }

    /**
     * @param _conteudoDesenvolvido the _conteudoDesenvolvido to set
     */
    public void setConteudoDesenvolvido(String _conteudoDesenvolvido) {
        this._conteudoDesenvolvido = _conteudoDesenvolvido;
    }

    /**
     * @return the _linkDaAulaGravada
     */
    public String getLinkDaAulaGravada() {
        return _linkDaAulaGravada;
    }

    /**
     * @param _linkDaAulaGravada the _linkDaAulaGravada to set
     */
    public void setLinkDaAulaGravada(String _linkDaAulaGravada) {
        this._linkDaAulaGravada = _linkDaAulaGravada;
    }

    /**
     * @return the _data
     */
    public Date getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(Date _data) {
        this._data = _data;
    }
    
    
}

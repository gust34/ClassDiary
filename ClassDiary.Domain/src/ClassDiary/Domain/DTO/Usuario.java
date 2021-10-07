package ClassDiary.Domain.DTO;

import java.util.Date;

public class Usuario 
{
    private int _id;
    private String _nomeCompleto;
    private String _telefone;
    private String _email;
    private String _nomeLogin;
    private String _senha;
    private String _cargo;
    private String _postoTrabalho;
    private Date _dataHora;
    
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
     * @return the _nomeCompleto
     */
    public String getNomeCompleto() {
        return _nomeCompleto;
    }

    /**
     * @param _nomeCompleto the _nomeCompleto to set
     */
    public void setNomeCompleto(String _nomeCompleto) {
        this._nomeCompleto = _nomeCompleto;
    }

    /**
     * @return the _telefone
     */
    public String getTelefone() {
        return _telefone;
    }

    /**
     * @param _telefone the _telefone to set
     */
    public void setTelefone(String _telefone) {
        this._telefone = _telefone;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }

    /**
     * @return the _nomeLogin
     */
    public String getNomeLogin() {
        return _nomeLogin;
    }

    /**
     * @param _nomeLogin the _nomeLogin to set
     */
    public void setNomeLogin(String _nomeLogin) {
        this._nomeLogin = _nomeLogin;
    }

    /**
     * @return the _senha
     */
    public String getSenha() {
        return _senha;
    }

    /**
     * @param _senha the _senha to set
     */
    public void setSenha(String _senha) {
        this._senha = _senha;
    }

    /**
     * @return the _cargo
     */
    public String getCargo() {
        return _cargo;
    }

    /**
     * @param _cargo the _cargo to set
     */
    public void setCargo(String _cargo) {
        this._cargo = _cargo;
    }

    /**
     * @return the _postoTrabalho
     */
    public String getPostoTrabalho() {
        return _postoTrabalho;
    }

    /**
     * @param _postoTrabalho the _postoTrabalho to set
     */
    public void setPostoTrabalho(String _postoTrabalho) {
        this._postoTrabalho = _postoTrabalho;
    }

    /**
     * @return the _dataHora
     */
    public Date getDataHora() {
        return _dataHora;
    }

    /**
     * @param _dataHora the _dataHora to set
     */
    public void setDataHora(Date _dataHora) {
        this._dataHora = _dataHora;
    }

}

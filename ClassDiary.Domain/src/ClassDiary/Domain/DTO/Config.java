package ClassDiary.Domain.DTO;

public class Config 
{
    private String _key;
    private String _value;

    /**
     * @return the _key
     */
    public String getKey() {
        return _key;
    }

    /**
     * @param _key the _key to set
     */
    public void setKey(String _key) {
        this._key = _key;
    }

    /**
     * @return the _value
     */
    public String getValue() {
        return _value;
    }

    /**
     * @param _value the _value to set
     */
    public void setValue(String _value) {
        this._value = _value;
    }
}

package ClassDiary.DataAccess.Core;

import java.util.List;

public interface IRepositoryBaseReadOnly<T>
{
    public T Get(int Id);
    public List<T> GetAll();
}

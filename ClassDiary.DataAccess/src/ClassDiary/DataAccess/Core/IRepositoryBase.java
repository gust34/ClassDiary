package ClassDiary.DataAccess.Core;

import ClassDiary.Common.Services.Result;
import java.util.List;

public interface IRepositoryBase<T> 
{
    public T Get(int Id);
    public List<T> GetAll();
    public Result Add(T e);
    public Result Update(T e);
    public Result Remove(int Id);
}

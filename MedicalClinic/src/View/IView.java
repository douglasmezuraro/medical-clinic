package View;

public interface IView<T> {
    
    public void modelToView(T model);
    public T viewToModel(T model);
    public void clear();
    public Long getId();
    public void setId(Long id);
    
}

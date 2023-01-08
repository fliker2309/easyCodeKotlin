import org.jetbrains.annotations.NotNull;

public interface MutableDataSource<T> extends DataSource<T> {

    void saveData(@NotNull T data);
}

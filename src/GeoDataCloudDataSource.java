import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GeoDataCloudDataSource implements DataSource<GeoData>{
    @Override
    @NotNull
    public GeoData getData() {
        return new GeoData(12,52.12,43.98);
    }
}

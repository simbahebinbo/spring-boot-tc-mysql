package scratches.tc.configuration;

import org.testcontainers.containers.MySQLContainer;

/**
 * @author Rashidi Zin
 */
public class DatasourceContainer extends MySQLContainer<DatasourceContainer> {

    private static final String IMAGE = "mysql";
    private static final String DEFAULT_TAG = "8";

    private static final String IMAGE_NAME = String.format("%s:%s", IMAGE, DEFAULT_TAG);

    public DatasourceContainer() {
        super(IMAGE_NAME);
    }

}

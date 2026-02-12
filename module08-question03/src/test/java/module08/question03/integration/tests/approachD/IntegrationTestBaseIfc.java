package module08.question03.integration.tests.approachD;

import module08.question03.configuration.ApplicationConfiguration;
import module08.question03.integration.tests.configuration.MockitoConfiguration;
import module08.question03.integration.tests.configuration.TestDataConfiguration;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ApplicationConfiguration.class, TestDataConfiguration.class, MockitoConfiguration.class})
public interface IntegrationTestBaseIfc {
}

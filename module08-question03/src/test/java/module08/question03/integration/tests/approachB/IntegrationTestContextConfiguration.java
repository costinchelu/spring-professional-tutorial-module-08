package module08.question03.integration.tests.approachB;

import module08.question03.configuration.ApplicationConfiguration;
import module08.question03.integration.tests.configuration.MockitoConfiguration;
import module08.question03.integration.tests.configuration.TestDataConfiguration;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@ContextConfiguration(classes = {ApplicationConfiguration.class, TestDataConfiguration.class, MockitoConfiguration.class})
public @interface IntegrationTestContextConfiguration {
}

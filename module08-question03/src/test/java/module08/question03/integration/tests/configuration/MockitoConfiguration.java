package module08.question03.integration.tests.configuration;

import module08.question03.service.GuestSharableDataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class MockitoConfiguration {

    @Bean
    public GuestSharableDataService guestSharableDataService() {
        return mock(GuestSharableDataService.class);
    }
}

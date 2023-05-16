package book.manager.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@ComponentScans({
        @ComponentScan("book.manager.service")
})
@Configuration
public class RootConfiguration {
}

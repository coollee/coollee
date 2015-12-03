package net.coollee.configuration;

import net.coollee.shared.CoolleeShareds;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CoolleeShareds.class)
public class CoolleeSharedApplicationContextConfig {

}

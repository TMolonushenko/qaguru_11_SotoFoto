package cloud.autotests.config.sotoFoto;

import org.aeonbits.owner.ConfigFactory;

public class App {
    public static cloud.autotests.config.demowebshop.AppConfig config = ConfigFactory.create(cloud.autotests.config.demowebshop.AppConfig.class, System.getProperties());
}

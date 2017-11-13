package com.bc.kjmq;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableScheduling
public class KjmqApplication implements CommandLineRunner{

	public static void main(String[] args) {
        new SpringApplicationBuilder(KjmqApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
	}

    @Override
    public void run(String... strings) throws Exception {

    }
}

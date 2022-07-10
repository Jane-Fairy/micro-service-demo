package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/10 12:17
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudGateway9527Application.class, args);
    }
}

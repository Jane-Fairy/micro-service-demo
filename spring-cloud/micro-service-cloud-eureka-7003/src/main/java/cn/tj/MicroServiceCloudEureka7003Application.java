package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 14:13
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableEurekaServer //开启 Eureka server,接受其他微服务的注册
public class MicroServiceCloudEureka7003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEureka7003Application.class, args);
    }
}

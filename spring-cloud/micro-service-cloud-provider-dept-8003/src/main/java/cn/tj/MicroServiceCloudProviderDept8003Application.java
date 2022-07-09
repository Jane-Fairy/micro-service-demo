package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 14:32
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableEurekaClient // Spring cloud Eureka 客户端，自动将本服务注册到 Eureka Server 注册中心中
public class MicroServiceCloudProviderDept8003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8003Application.class, args);
    }
}

package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:42
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableEurekaClient //开启 Eureka 客户端功能
@EnableCircuitBreaker //激活熔断器功能
public class MicroServiceCloudProviderDeptHystrix8004Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDeptHystrix8004Application.class, args);
    }
}

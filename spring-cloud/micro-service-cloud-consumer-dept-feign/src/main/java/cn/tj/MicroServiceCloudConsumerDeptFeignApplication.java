package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:25
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableFeignClients //开启 OpenFeign 功能
@EnableHystrix //启用 Hystrix
public class MicroServiceCloudConsumerDeptFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDeptFeignApplication.class, args);
    }
}

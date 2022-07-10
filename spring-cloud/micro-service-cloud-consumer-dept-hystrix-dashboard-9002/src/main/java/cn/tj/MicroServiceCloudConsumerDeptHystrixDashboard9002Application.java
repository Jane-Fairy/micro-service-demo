package cn.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 21:46
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MicroServiceCloudConsumerDeptHystrixDashboard9002Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDeptHystrixDashboard9002Application.class, args);
    }
}

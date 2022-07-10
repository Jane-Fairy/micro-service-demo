package cn.tj.config;

import cn.tj.myrule.MyRandomRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:16
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@Configuration
public class MySelfRibbonRuleConfig {
    @Bean
    public IRule myRule() {
        //自定义 Ribbon 负载均衡策略
        return new MyRandomRule(); //自定义，随机选择某一个微服务，执行五次
    }
}


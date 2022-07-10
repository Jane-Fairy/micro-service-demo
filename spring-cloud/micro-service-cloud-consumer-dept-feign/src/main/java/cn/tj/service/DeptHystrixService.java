package cn.tj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:47
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */

@Component
@FeignClient(value = "MICROSERVICECLOUDPROVIDERDEPTHYSTRIX" , fallback = DeptHystrixFallBackService.class)
public interface DeptHystrixService {

    @RequestMapping(value = "/dept/hystrix/ok/{id}")
    public String deptInfo_Ok(@PathVariable("id") Integer id);

    @RequestMapping(value = "/dept/hystrix/timeout/{id}")
    public String deptInfo_Timeout(@PathVariable("id") Integer id);

}

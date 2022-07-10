package cn.tj.controller;

import cn.tj.entity.Dept;
import cn.tj.service.DeptFeignService;
import cn.tj.service.DeptHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:24
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@RestController
@DefaultProperties(defaultFallback = "dept_Global_FallbackMethod")
public class DeptController_Consumer {

    @Resource
    private DeptFeignService deptFeignService;
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        System.out.println("hello openFeign");
        return deptFeignService.get(id);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        System.out.println("hello openFeign");
        return deptFeignService.list();
    }


    @Resource
    private DeptHystrixService deptHystrixService;


    @RequestMapping(value = "/consumer/dept/hystrix/ok/{id}")
    public String deptInfo_Ok(@PathVariable("id") Integer id) {
        return deptHystrixService.deptInfo_Ok(id);
    }
    //在客户端进行降级
    @RequestMapping(value = "/consumer/dept/hystrix/timeout/{id}")
    //@HystrixCommand(fallbackMethod = "dept_TimeoutHandler") //为该请求指定专属的回退方法
    @HystrixCommand //全局服务降级
    public String deptInfo_Timeout(@PathVariable("id") Integer id) {
        String s = deptHystrixService.deptInfo_Timeout(id);
        return s;
    }
    // deptInfo_Timeout方法的 专用 fallback 方法
    public String dept_TimeoutHandler(@PathVariable("id") Integer id) {
        return "C语言中文网提醒您：服务端系统繁忙，请稍后再试！（客户端 deptInfo_Timeout 专属的回退方法触发）";
    }

    public String dept_Global_FallbackMethod() {
        return "C语言中文网提醒您，运行出错或服务端系统繁忙，请稍后再试！（客户端全局回退方法触发,） all";
    }
}

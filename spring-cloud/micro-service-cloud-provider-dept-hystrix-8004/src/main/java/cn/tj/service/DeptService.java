package cn.tj.service;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:37
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
public interface DeptService {
    // hystrix 熔断器示例 ok
    public String deptInfo_Ok(Integer id);
    //hystrix 熔断器超时案例
    public String deptInfo_Timeout(Integer id);


    // Hystrix 熔断机制案例
    public String deptCircuitBreaker(Integer id);
}

package cn.tj.service;

import org.springframework.stereotype.Component;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 18:16
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@Component
public class DeptHystrixFallBackService implements DeptHystrixService {
    @Override
    public String deptInfo_Ok(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
    @Override
    public String deptInfo_Timeout(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
}
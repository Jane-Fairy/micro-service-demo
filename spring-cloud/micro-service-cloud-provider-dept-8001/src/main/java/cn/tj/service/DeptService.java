package cn.tj.service;

import cn.tj.entity.Dept;

import java.util.List;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 14:29
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}


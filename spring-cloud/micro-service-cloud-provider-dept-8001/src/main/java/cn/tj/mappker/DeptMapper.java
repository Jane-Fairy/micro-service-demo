package cn.tj.mappker;

import cn.tj.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 14:22
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@Mapper
public interface DeptMapper {
    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);
    //获取表中的全部数据
    List<Dept> GetAll();
}

package cn.tj.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 14:08
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@NoArgsConstructor //无参构造函数
@Data // 提供类的get、set、equals、hashCode、canEqual、toString 方法
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}


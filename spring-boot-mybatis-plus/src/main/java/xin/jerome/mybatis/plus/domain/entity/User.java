package xin.jerome.mybatis.plus.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import xin.jerome.mybatis.plus.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author JeromeSoar
 * @since 2020-06-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_user")
public class User extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 姓名
     */
    private String name;


}

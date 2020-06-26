package xin.jerome.mybatis.plus.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体基类
 *
 * @author JeromeSoar
 * @since 2020年 06月 26日 14:10
 */
@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    protected String id;

    /**
     * 创建人
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    protected String createUser;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_user", fill = FieldFill.UPDATE)
    protected String updateUser;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    protected Date updateTime;

    /**
     * 逻辑删除标识: (1: 删除; 0: 正常(数据库默认))
     */
    @TableLogic
    private String delFlag;

}

/* https://github.com/orange1438 */
package com.platform.dao.mapper;

import com.platform.dao.entity.User;
import org.springframework.stereotype.Repository;

/**
 * mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 *
 * @author houxingfen
 * date:2019/04/12 15:43
 */
@Repository
public interface UserMapper {

    /**
     * 根据ID查询
     *
     * @param id 主键ID
     * @return 返回查询的结果
     */
    User selectByPrimaryKey(Integer id);
}
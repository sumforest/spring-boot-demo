package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:50
 * @Description:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

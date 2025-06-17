package dao;

import java.sql.ResultSet;

/**
 * @author .Yur
 * @create 2025-06-15 20:51
 * @desc 结果集的处理器接口
 **/
public interface ResultSetHandler<T> {
    T resultSetHandler(ResultSet resultSet);
}

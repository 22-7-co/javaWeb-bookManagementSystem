package dao;

import java.util.List;

/**
 * @author .Yur
 * @create 2025-06-15 17:30
 * @desc 所有数据库访问的总接口
 **/
public interface DAO <T>{
    /**
     * @Description :添加对应的对象，添加成功返回1，否则返回0
     * @Param * @param id ：
     * @return int
     **/
    int save(T t);
    /**
     * @Description :更新对应的对象，更新成功返回1，否则返回0
     * @Param * @param id ：
     * @return int
     **/
    int upDate(T t);
    /**
     * @Description :删除指定id对应的对象，删除成功返回1，否则返回0
     * @Param * @param id ：
     * @return int
     **/
    int remove(int id);
    /**
     * @Description :获取指定id对应的对象
     * @Param * @param id ：
     * @return T
     **/
    T get(int id);
    /**
     * @Description :获取所有的数据
     * @Date 19:48 2020/2/2 0002
     * @Param * @param  ：
     * @return java.util.List<T>
     **/
    List<T> getAll();
    /**
     * @Description :获取总记录数
     * @Param * @param  ：
     * @return int
     **/
    int getCount(String sql);
}

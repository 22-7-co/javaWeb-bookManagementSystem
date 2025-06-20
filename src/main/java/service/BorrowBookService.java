package service;


import domain.BorrowBook;

/**
 * @author .Yur
 * @create 2025-06-15 20:36
 * @desc 借书的业务逻辑接口
 **/
public interface BorrowBookService {
/**
 * @Description :将借书记录存储到数据库中去
 * @Param * @param borrowBook ：
 * @return boolean
 **/
    boolean saveBorrowBook(BorrowBook borrowBook);
}

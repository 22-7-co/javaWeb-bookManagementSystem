package service.impl;

import dao.BorrowBookDao;
import dao.impl.BorrowBookDaoImpl;
import domain.BorrowBook;
import service.BorrowBookService;

/**
 * @author .Yur
 * @create 2025-06-15 20:37
 * @desc 借书业务逻辑的实现
 **/
public class BorrowBookServiceImpl implements BorrowBookService {
    BorrowBookDao borrowBookDao =  new BorrowBookDaoImpl();
    @Override
    public boolean saveBorrowBook(BorrowBook borrowBook) {
        int result = borrowBookDao.save(borrowBook);
        return result==1;
    }
}

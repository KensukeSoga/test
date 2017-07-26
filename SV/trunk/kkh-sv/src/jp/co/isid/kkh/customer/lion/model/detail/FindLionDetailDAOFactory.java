package jp.co.isid.kkh.customer.lion.model.detail;

import jp.co.isid.nj.integ.DaoFactory;


/**
 * <P>
 * 汎用マスタ検索DAOのファクトリクラス
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/02/17 JSE A.Naito)<BR>
 * </P>
 * @author
 */
public class FindLionDetailDAOFactory extends DaoFactory {

    /**
    * インスタンス化を禁止します。
    */
    private FindLionDetailDAOFactory() {
    }

    /**
    * DAOインスタンスを生成します。
    * @return DAOインスタンス
    */
    public static FindLionDetailDAO createFindLionDetailDAO() {
        return (FindLionDetailDAO) DaoFactory.createDao(FindLionDetailDAO.class);
    }
}

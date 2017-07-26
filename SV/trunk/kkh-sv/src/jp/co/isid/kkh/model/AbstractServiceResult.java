package jp.co.isid.kkh.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.kkh.service.base.ErrorInfo;

/**
 * <P>
 * Webサービスの処理結果を保持する抽象クラスです。
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2010/12/13 ISID-IT K.Nukita)<BR>
 * </P>
 * @author ISID-IT K.Nukita
 */
@XmlRootElement(namespace = "http://model.kkh.isid.co.jp/")
@XmlType(namespace = "http://model.kkh.isid.co.jp/")
public abstract class AbstractServiceResult {

    /** エラー情報 */
    private ErrorInfo _errorInfo = new ErrorInfo();

    /**
     * エラー情報を返します。
     * @return エラー情報
     */
    public ErrorInfo getErrorInfo() {
        return _errorInfo;
    }

    /**
     * エラー情報を設定します。
     * @param errorInfo エラー情報
     */
    public void setErrorInfo(ErrorInfo errorInfo) {
        _errorInfo = errorInfo;
    }

    /**
    * エラーか否かを取得します。
    * @return エラーか否か
    */
    public boolean isError() {

        if (_errorInfo == null) {
            return false;
        }
        return _errorInfo.isError();
    }

    /**
    * KKHExceptionを元にErrorInfoを設定します。
    * @param e KKHException
    */
    public void toErrorInfo(KKHException e) {
        ErrorInfo info = new ErrorInfo();
        info.setError(true);
        info.setErrorCode(e.getErrorID());
        info.setNote(e.getNoteList());
        this.setErrorInfo(info);
    }
}

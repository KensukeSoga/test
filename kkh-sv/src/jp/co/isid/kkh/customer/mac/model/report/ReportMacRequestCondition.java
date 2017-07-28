package jp.co.isid.kkh.customer.mac.model.report;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class ReportMacRequestCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 再印刷フラグ */
    private String _reflg;
    /** 店舗区分 */
    private String _tenpoKbn;
    /** 店舗コード */
    private String _tenpocd;
    /** 伝票番号FROM */
    private String _denfr;
    /** 伝票番号TO */
    private String _dento;

    /**
     * 再印刷フラグを取得する
     * @return String 再印刷フラグ
     */
    public String getreflg() {
        return _reflg;
    }

    /**
     * 再印刷フラグを設定する
     * @param reflg String 再印刷フラグ
     */
    public void setreflg(String reflg) {
        this._reflg = reflg;
    }

    /**
     * 店舗区分を取得する
     * @return String 店舗区分
     */
    public String gettenpoKbn() {
        return _tenpoKbn;
    }

    /**
     * 店舗区分を設定する
     * @param tenpoKbn String 店舗区分
     */
    public void settenpoKbn(String tenpoKbn) {
        this._tenpoKbn = tenpoKbn;
    }

    /**
     * 店舗コードを取得する
     * @return String 店舗コード
     */
    public String gettenpocd() {
        return _tenpocd;
    }

    /**
     * 店舗コードを設定する
     * @param splitflg String 店舗コード
     */
    public void settenpocd(String tenpocd) {
        this._tenpocd = tenpocd;
    }

    /**
     * 伝票番号FROMを取得する
     * @return String 伝票番号FROM
     */
    public String getdenfr() {
        return _denfr;
    }

    /**
     * 伝票番号FROMを設定する
     * @param denfr String 伝票番号FROM
     */
    public void setdenfr(String denfr) {
        this._denfr = denfr;
    }

    /**
     * 伝票番号TOを取得する
     * @return String 伝票番号TO
     */
    public String getdento() {
        return _dento;
    }

    /**
     * 伝票番号TOを設定する
     * @param _dento String 伝票番号TO
     */
    public void setdento(String dento) {
        this._dento = dento;
    }

}

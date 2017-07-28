package jp.co.isid.kkh.customer.mac.model.report;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class ReportMacCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 伝票番号FROM*/
    private String _denfr;
    /** 伝票番号TO*/
    private String _dento;

    /**
     * @return kbn
     */
    public String getdenfr() {
        return _denfr;
    }
    /**
     * @param denfr セットする denfr
     */
    public void setdenfr(String denfr) {
        this._denfr = denfr;
    }
    /**
     * @return getdento
     */
    public String getdento() {
        return _dento;
    }
    /**
     * @param _dento セットする _dento
     */
    public void setdento(String dento) {
        this._dento = dento;
    }

}

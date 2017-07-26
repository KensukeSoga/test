package jp.co.isid.kkh.customer.uni.model.report;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class ReportUniCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 帳票区分 */
    private String _repKbn;
    private String _Busho = null;

    /**
     * 帳票区分を返します。
     *
     * @return repKbn
     */
    public String getRepKbn() {
        return _repKbn;
    }

    /**
     * 帳票区分を設定します。
     *
     * @param repKbn
     */
    public void setRepKbn(String repKbn) {
        this._repKbn = repKbn;
    }

    /**
     * 部署を返します。
     *
     * @return Busho
     */
    public String getBusho() {
        return _Busho;
    }

    /**
     * 部署を設定します。
     *
     * @param Busho
     */
    public void setBusho(String Busho) {
        this._Busho = Busho;
    }

}

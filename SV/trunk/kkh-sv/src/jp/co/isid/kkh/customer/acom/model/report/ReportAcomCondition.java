package jp.co.isid.kkh.customer.acom.model.report;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class ReportAcomCondition extends AbstractServiceCondition{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/** 媒体 */
	private String _baitai;

	/**
	 * @return _baitai
	 */
	public String getbaitai() {
		return _baitai;
	}
	/**
	 * @param baitai セットする baitai
	 */
	public void setbaitai(String baitai) {
		this._baitai = baitai;
	}

}

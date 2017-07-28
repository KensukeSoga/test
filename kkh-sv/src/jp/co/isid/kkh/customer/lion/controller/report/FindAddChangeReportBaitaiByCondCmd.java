package jp.co.isid.kkh.customer.lion.controller.report;

import jp.co.isid.kkh.customer.lion.model.report.AddChangeReportLionBaitaiCondition;
import jp.co.isid.kkh.customer.lion.model.report.AddChangeReportLionBaitaiManager;
import jp.co.isid.kkh.customer.lion.model.report.AddChangeReportLionBaitaiResult;
import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * ライオン帳票(追加変更リスト)検索コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2014/07/31 HLC S.Fujimoto)<BR>
 * </P>
 *
 * @author HLC S.Fujimoto
 */
public class FindAddChangeReportBaitaiByCondCmd extends Command{

    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** 検索条件 */
    private AddChangeReportLionBaitaiCondition _condition;

    /**
     * 検索条件を使用し、検索処理を実行します。
     * @throws KKHException 検索に失敗した場合
     */
    public void execute() throws KKHException {
        AddChangeReportLionBaitaiManager manager = AddChangeReportLionBaitaiManager.getInstance();
        AddChangeReportLionBaitaiResult result = manager.findByCondition(_condition);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * 検索条件を設定します。
     *
     * @param condition CommonCodeMasterSearchCondition 検索条件
     */
    public void setFindAddChangeReportCondition(AddChangeReportLionBaitaiCondition condition) {
        _condition = condition;
    }

    /**
     * 条件検索結果を返します。
     *
     * @return ReportLionResult 条件検索結果
     */
    public AddChangeReportLionBaitaiResult getAddChangeReportResult() {
        return (AddChangeReportLionBaitaiResult) super.getResult().get(RESULT_KEY);
    }

}

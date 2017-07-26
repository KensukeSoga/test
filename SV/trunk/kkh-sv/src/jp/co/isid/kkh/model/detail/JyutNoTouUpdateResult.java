package jp.co.isid.kkh.model.detail;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jp.co.isid.kkh.model.AbstractServiceResult;

/**
*
* <P>
* 受注No統合の結果を保持する。
* </P>
* <P>
* <B>修正履歴</B><BR>
* ・新規作成(2011/12/27 H.izawa)<BR>
* </P>
* @author
*/
@XmlRootElement(namespace = "http://detail.model.kkh.isid.co.jp/")
@XmlType(namespace = "http://detail.model.kkh.isid.co.jp/")
public class JyutNoTouUpdateResult extends AbstractServiceResult {

}

﻿using System;
using System.Collections.Generic;
using System.Text;
using Isid.NJSecurity.Core.Impl;
using Isid.NJSecurity.Core;
using Isid.NJSecurity.Util;

namespace Isid.KKH.Common.KKHUtility.Security
{
    /// <summary>
    /// SecurityContextFactory
    /// </summary>
    /// <remarks>
    /// FW提供のSecurityContextFactoryの実体クラスを利用すると、
    /// 
    /// 上記問題に対応するため、SecurityContextFactoryの実体クラスをラップし、
    /// またFWの初期化にSecurityContextFactoryを利用するため、
    public class ConcreteSecurityContextFactory : SecurityContextFactory
    {
        /// <summary>
        /// SecurityContextFactoryの実体クラス
        /// </summary>
        SecurityContextFactory _factory = null;

        /// <summary>
        /// SecurityAppId
        /// </summary>
        private string _securityAppId;

        /// <summary>
        /// コンストラクタ
        /// </summary>
        public ConcreteSecurityContextFactory()
            : base()
        {
            string factoryName = KKHParameter.GetInstance().SecurityContextFactoryClassName;
            _factory = (SecurityContextFactory)InstanceUtil.CreateInstance(factoryName);
            _securityAppId = KKHParameter.GetInstance().SecurityAppId;
        }

        /// <summary>
        /// 使用する所属を変更します。
        /// <param name="uniqueCode">UserProfileを一意に指定できるコード</param>
        /// <returns>所属変更処理の結果 true:変更完了　false:変更失敗</returns>
        public override bool ChangeCurrentUserProfile(string uniqueCode)
        {
            return _factory.ChangeCurrentUserProfile(uniqueCode);
        }

        /// <summary>
        /// 台帳・請求・カレンダ日付を取得します。
        /// <returns>日付(yyyyMMdd)</returns>
        public override int[] CreateDate()
        {
            return _factory.CreateDate();
        }

        /// <summary>
        /// ログインコンテキストを取得します。
        /// <returns>ログインコンテキスト</returns>
        public override LoginContext CreateLoginContext()
        {
            return _factory.CreateLoginContext();
        }

        /// <summary>
        /// セキュリティロールリストを取得します。
        /// <param name="categoryList">種別リスト</param>
        /// <returns>セキュリティロールリスト key:種別</returns>
        public override IDictionary<string, ISecurityRole> CreateSecuriryRole(IList<string> categoryList)
        {
            return _factory.CreateSecuriryRole(categoryList);
        }

        /// <summary>
        /// ISecurityInfoを取得します。
        /// <param name="id">ESQID</param>
        /// <param name="pass">パスワード</param>
        /// <param name="appid">アプリID</param>
        /// <param name="terminalkind">ESQ端末/非ESQ端末</param>
        /// <returns>ISecurityInfo</returns>
        public override ISecurityInfo CreateSecurityInfo(string id, string pass, string appid, string terminalkind)
        {
            return _factory.CreateSecurityInfo(id, pass, _securityAppId, terminalkind);
        }

        /// <summary>
        /// SecurityRoleを取得します。
        /// <returns>セキュリティロールリスト</returns>
        public override IList<ISecurityRole> CreateSecurityRoleAll()
        {
            return _factory.CreateSecurityRoleAll();
        }
    }
}
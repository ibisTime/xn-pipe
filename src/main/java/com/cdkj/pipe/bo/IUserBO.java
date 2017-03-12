package com.cdkj.pipe.bo;

import com.cdkj.pipe.dto.res.XN805901Res;
import com.cdkj.pipe.dto.res.XN805930Res;
import com.cdkj.pipe.dto.res.XN805931Res;

public interface IUserBO {
    /**
     * 获取远程用户信息
     * @param tokenId
     * @param userId
     * @return 
     * @create: 2016年5月30日 下午3:00:44 xieyj
     * @history:
     */
    public XN805901Res getRemoteUser(String tokenId, String userId);

    // 新增经销商
    public String doSaveDealer(String loginName, String updater);

    /**
     * 注销用户
     * @param userId
     * @param updater 
     * @create: 2017年2月12日 下午8:25:10 xieyj
     * @history:
     */
    public void doCancelUser(String userId, String updater);

    /**
     * 校验登录密码
     * @param userId
     * @param loginPwd 
     * @return 
     * @create: 2017年2月16日 下午2:30:28 xieyj
     * @history:
     */
    public void doCheckLoginPwd(String userId, String loginPwd);

    /**
     * 将用户拉入黑名单
     * @param userId
     * @param type
     * @param remark 
     * @create: 2017年2月22日 下午3:29:01 haiqingzheng
     * @history:
     */
    public void doAddToBlacklist(String userId, String type, String remark);

    /**
     * 判断用户在黑名单中
     * @param userId
     * @param type
     * @return 
     * @create: 2017年2月22日 下午3:30:07 haiqingzheng
     * @history:
     */
    public boolean doCheckBlacklist(String userId, String type);

    /**
     * 微信登录注册
     * @param code
     * @param amount
     * @param systemCode
     * @return 
     * @create: 2017年3月8日 下午3:10:55 xieyj
     * @history:
     */
    public XN805930Res doLoginReg(String code, Long amount, String systemCode);

    /**
     * 签到送积分
     * @param userId
     * @param location
     * @param amount
     * @return 
     * @create: 2017年3月6日 下午10:34:23 xieyj
     * @history:
     */
    public XN805931Res signToday(String userId, String location, Long amount);

}

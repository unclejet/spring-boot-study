package com.uj.study.util;

import com.uj.study.vo.User;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:02
 * @description：
 */
public class UserPermissionUtil {
    /**
     * 模拟权限校验, 可以根据自己项目需要定制不同的策略,如查询数据库获取具体的菜单url或者角色等等.
     *
     * @param user
     */
    public static boolean verify(User user, HttpServletRequest request) {
        String url = request.getHeader("x-user-serviceName");
        if (StringUtils.isEmpty(user)) {
            return false;
        } else {
            List<String> str = user.getAllowPermissionService();
            for (String permissionService : str) {
                if (url.equalsIgnoreCase(permissionService)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * 模拟权限赋值, 可以根据自己项目需要定制不同的策略,如查询数据库获取具体的菜单url或者角色等等.
     *
     * @param user
     */
    public static void permission(User user) {
        if (user.getUserName().equals("admin")) {
            List allowPermissionService = new ArrayList();
            allowPermissionService.add("client-service");
            allowPermissionService.add("provider-service");
            user.setAllowPermissionService(allowPermissionService);
        } else if (user.getUserName().equals("spring")) {
            List allowPermissionService = new ArrayList();
            allowPermissionService.add("client-service");
            user.setAllowPermissionService(allowPermissionService);
        } else {
            List allowPermissionService = new ArrayList();
            user.setAllowPermissionService(allowPermissionService);
        }
    }
}

package com.yupi.yupicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * 用户角色枚举
 */
@Getter
public enum UserRoleEnum {

    USER("USER", "普通用户"),
    ADMIN("ADMIN", "管理员");

    private final String text;
    private final String value;

    UserRoleEnum(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 根据 value 值获取枚举
     * @param value 枚举值的value
     * @return 枚举值
     */

    public static UserRoleEnum getEnumByValue(String value) {
        if(ObjUtil.isEmpty(value)) {
            return null;
        }
        for(UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            if(userRoleEnum.value.equals(value)) {
                return userRoleEnum;
            }
        }
        return null;
    }
}

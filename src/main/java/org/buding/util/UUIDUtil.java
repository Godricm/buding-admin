package org.buding.util;

import java.util.UUID;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: STO
 * \* Date: 2019/6/24
 * \* Time: 15:20
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class UUIDUtil {
    public static String createUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

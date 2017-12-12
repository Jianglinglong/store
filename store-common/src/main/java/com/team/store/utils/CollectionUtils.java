package com.team.store.utils;

import java.util.Collection;

/**
 * 集合工具类
 */
public class CollectionUtils {
    public static boolean isNotEmpty(Collection collection){
        if (collection!=null && collection.size()>0){
            return true;
        }
        return false;
    }
}

package com.team.store.service.person;


import java.util.TreeMap;

import com.team.store.po.ProductInfo;

public interface FavoriteService {
    boolean addToFavorite(int userId, int proId);
    void deleteFavorite(int userId,int favoriteId);
    TreeMap<String, ProductInfo> getFavorites(int user);
}

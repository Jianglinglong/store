package com.team.store.mapper;

import java.util.List;

import com.team.store.po.Favorite;
import com.team.store.po.FavoriteExample;
import com.team.store.vo.FavoritePro;
import org.apache.ibatis.annotations.Param;

public interface FavoriteMapper {
    int countByExample(FavoriteExample example);

    int deleteByExample(FavoriteExample example);

    int deleteByPrimaryKey(Integer favoriteId);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    List<Favorite> selectByExample(FavoriteExample example);

    Favorite selectByPrimaryKey(Integer favoriteId);

    int updateByExampleSelective(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    int updateByExample(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);

    List<FavoritePro> selectFavoritePro(int userId);
}
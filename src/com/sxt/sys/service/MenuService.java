package com.sxt.sys.service;

import com.sxt.sys.domain.Menu;
import com.sxt.sys.vo.MenuVo;

import java.util.List;

public interface MenuService {

    /**
     * 查询所有菜单返回
     * List<Menu>
     */
    List<Menu> queryAllMenuForList(MenuVo menuVo);

    /**
     * 根据用户id查询用户的可用菜单
     */
    List<Menu> queryMenuByUserIdForList(MenuVo menuVo, Integer userId);
    
}
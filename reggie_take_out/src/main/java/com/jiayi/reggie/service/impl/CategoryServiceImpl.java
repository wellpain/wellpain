package com.jiayi.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiayi.reggie.common.CustomException;
import com.jiayi.reggie.entity.Category;
import com.jiayi.reggie.entity.Dish;
import com.jiayi.reggie.entity.Setmeal;
import com.jiayi.reggie.mapper.CategoryMapper;
import com.jiayi.reggie.service.CategoryService;
import com.jiayi.reggie.service.DishService;
import com.jiayi.reggie.service.SetMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetMealService setMealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
        //查询当前分类是否关联了菜品
        queryWrapper.eq(Dish::getCategoryId, id);
        int count = dishService.count(queryWrapper);

        if (count > 0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }
        // 查询当前分类是否关联了套餐
        LambdaQueryWrapper<Setmeal> queryWrapper1 = new LambdaQueryWrapper<>();
        queryWrapper1.eq(Setmeal::getCategoryId, id);
        int count1 = setMealService.count(queryWrapper1);
        if (count1 > 0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        // 正常删除分类

        super.removeById(id);
    }
}

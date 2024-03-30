package com.jiayi.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiayi.reggie.common.CustomException;
import com.jiayi.reggie.dto.SetmealDto;
import com.jiayi.reggie.entity.Setmeal;
import com.jiayi.reggie.entity.SetmealDish;
import com.jiayi.reggie.mapper.SetMealMapper;
import com.jiayi.reggie.service.SetMealDishService;
import com.jiayi.reggie.service.SetMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SetMealServiceImpl extends ServiceImpl<SetMealMapper, Setmeal> implements SetMealService {
    @Autowired
    private SetMealDishService setMealDishService;


    @Override
    @Transactional
    public void saveWithDish(SetmealDto setmealDto) {
        //保存套餐的信息，操作setmeal表
        this.save(setmealDto);
        List<SetmealDish> setmealDishList = setmealDto.getSetmealDishes();
        for (SetmealDish setmealDish : setmealDishList) {
            setmealDish.setSetmealId(setmealDto.getId());
        }

        setMealDishService.saveBatch(setmealDishList);
    }

    @Override
    @Transactional
    public void removeWithDish(List<Long> ids) {
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(Setmeal::getId, ids);
        queryWrapper.eq(Setmeal::getStatus, 1);
        int count = this.count(queryWrapper);
        if (count>0){
            throw new CustomException("套餐正在售卖中，不能删除");
        }

        this.removeByIds(ids);

        LambdaQueryWrapper<SetmealDish> queryWrapper1 = new LambdaQueryWrapper<>();
        queryWrapper1.in(SetmealDish::getSetmealId, ids);
        setMealDishService.remove(queryWrapper1) ;
    }
}

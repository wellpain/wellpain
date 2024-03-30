package com.jiayi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiayi.reggie.entity.Setmeal;
import com.jiayi.reggie.entity.SetmealDish;
import com.jiayi.reggie.mapper.SetMealDishMapper;
import com.jiayi.reggie.mapper.SetMealMapper;
import com.jiayi.reggie.service.SetMealDishService;
import com.jiayi.reggie.service.SetMealService;
import org.springframework.stereotype.Service;

@Service
public class SetMealDishServiceImpl extends ServiceImpl<SetMealDishMapper, SetmealDish> implements SetMealDishService {
}

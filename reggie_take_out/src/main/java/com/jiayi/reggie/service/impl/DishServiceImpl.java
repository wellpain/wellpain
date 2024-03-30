package com.jiayi.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiayi.reggie.dto.DishDto;
import com.jiayi.reggie.entity.Dish;
import com.jiayi.reggie.entity.DishFlavor;
import com.jiayi.reggie.mapper.DishMapper;
import com.jiayi.reggie.service.DishFlavorService;
import com.jiayi.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {


    @Autowired
    private DishFlavorService dishFlavorService;


    @Transactional
    @Override
    public void saveWithFlavor(DishDto dishDto) {
      //保存菜品的基本信息
      this.save(dishDto);

        Long dishid = dishDto.getId();// 菜品id
        List<DishFlavor> flavors = dishDto.getFlavors(); // 菜品口味
//        flavors = flavors.stream().map((item) ->{
//           item.setDishId(dishid);
//           return item;
//        }).collect(Collectors.toList());

        for (DishFlavor flavor : flavors) {
            flavor.setDishId(dishid);
        }

        dishFlavorService.saveBatch(flavors);


        //保存菜品口味数据到菜品口味表
//        dishFlavorService.saveBatch(dishDto.getFlavors());

    }

    @Override
    public DishDto getByIdWithFlavor(Long id) {
        Dish dish = this.getById(id);
        DishDto dishDto = new DishDto();

        BeanUtils.copyProperties(dish, dishDto);

        LambdaQueryWrapper<DishFlavor> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DishFlavor::getDishId, dish.getId());
        List<DishFlavor> flavors = dishFlavorService.list(queryWrapper);

        dishDto.setFlavors(flavors);
        return dishDto;
    }

    @Override
    public void updateWithFlavor(DishDto dishDto) {
        //更新dish表
        this.updateById(dishDto);
        //清理菜口味表
        LambdaQueryWrapper<DishFlavor> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DishFlavor::getDishId, dishDto.getId());
        dishFlavorService.remove(queryWrapper);

        List<DishFlavor> flavors = dishDto.getFlavors();
        for (DishFlavor flavor : flavors) {
            flavor.setDishId(dishDto.getId());
        }
        dishFlavorService.saveBatch(flavors);

    }
}

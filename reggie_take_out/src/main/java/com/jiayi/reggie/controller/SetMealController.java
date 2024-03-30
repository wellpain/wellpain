package com.jiayi.reggie.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiayi.reggie.common.R;
import com.jiayi.reggie.dto.SetmealDto;
import com.jiayi.reggie.entity.Category;
import com.jiayi.reggie.entity.Setmeal;
import com.jiayi.reggie.service.CategoryService;
import com.jiayi.reggie.service.SetMealDishService;
import com.jiayi.reggie.service.SetMealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/setmeal")
@Slf4j
public class SetMealController {

    @Autowired
    private SetMealService setMealService;

    @Autowired
    private SetMealDishService setMealDishService;

    @Autowired
    private CategoryService categoryService;



    @PostMapping
    public R<String> save(@RequestBody  SetmealDto setmealDto){
        log.info("套餐信息：{}", setmealDto.toString());
        setMealService.saveWithDish(setmealDto);
        return R.success("新增套餐成功");
    }


    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name){
        //分页构造器
        Page<Setmeal> pageInfo = new Page<>();
        Page<SetmealDto> dtoPage = new Page<>();

        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据name进行模糊查询
        queryWrapper.like(name != null, Setmeal::getName, name);
        queryWrapper.orderByDesc(Setmeal::getUpdateTime);

        setMealService.page(pageInfo, queryWrapper);


        BeanUtils.copyProperties(pageInfo, dtoPage, "records");
        List<Setmeal> records = pageInfo.getRecords();

        List<SetmealDto> list = records.stream().map((item) -> {
            SetmealDto setmealDto = new SetmealDto();
            //对象拷贝
            BeanUtils.copyProperties(item, setmealDto);
            Long categoryId = item.getCategoryId();
            Category category = categoryService.getById(categoryId);
            if (category != null){
                setmealDto.setCategoryName(category.getName());
            }
            return setmealDto;
        }).collect(Collectors.toList());

        dtoPage.setRecords(list);

        return R.success(dtoPage);
    }


    @DeleteMapping
    public R<String> delete(@RequestParam List<Long> ids){
        log.info("ids:{}", ids);
        setMealService.removeWithDish(ids);
        return R.success("套餐数据删除成功");
    }

    @PostMapping("/status/{id}")
    public R<String> updateStatus(@PathVariable Integer id, @RequestParam List<Long> ids){

        UpdateWrapper<Setmeal> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("status", id);
        updateWrapper.in("id", ids);
        setMealService.update(updateWrapper);
        return R.success("修改状态成功");
    }
}

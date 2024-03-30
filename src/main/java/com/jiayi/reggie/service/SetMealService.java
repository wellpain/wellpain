package com.jiayi.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiayi.reggie.dto.SetmealDto;
import com.jiayi.reggie.entity.Setmeal;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SetMealService extends IService<Setmeal> {

    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}

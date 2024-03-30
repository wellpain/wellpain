package com.jiayi.reggie.dto;

import com.jiayi.reggie.entity.Setmeal;
import com.jiayi.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

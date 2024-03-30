package com.jiayi.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiayi.reggie.common.R;
import com.jiayi.reggie.entity.Employee;
import com.jiayi.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.form.PasswordInputTag;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request,  @RequestBody Employee employee){
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Employee> querywrapper = new LambdaQueryWrapper<>();
        querywrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(querywrapper);

        if (emp == null){
            return R.error("登录失败");
        }
        if (!emp.getPassword().equals(password)){
            return R.error("登录失败");
        }
        if (emp.getStatus() == 0){
            return R.error("账号已禁用");
        }
        request.getSession().setAttribute("employee", emp.getId());
        return R.success(emp);
    }


    @PostMapping("/logout")
    public R<String> logOut(HttpServletRequest request){
        //清理session
        request.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Employee employee){
        log.info("新增员工, 员工信息：{}",employee.toString());
        //设置密码，密码进行md5加密
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

//        employee.setCreateTime(LocalDateTime.now());
//        employee.setUpdateTime(LocalDateTime.now());
//
//        Long emId = (Long) request.getSession().getAttribute("employee");
//        employee.setCreateUser(emId);
//        employee.setUpdateUser(emId);

        employeeService.save(employee);
        return R.success("新增员工成功");

    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name){

        log.info("page = {}, pagesize = {}, name = {}", page, pageSize, name);

        // 构造分液器
        Page pageInfo = new Page(page, pageSize);

        //构造条件构造器
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper();
        // 添加条件
        queryWrapper.like(StringUtils.isNotEmpty(name), Employee::getName, name);

        queryWrapper.orderByDesc(Employee::getUpdateTime);

        employeeService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }


    @PutMapping
    public R<String> update(HttpServletRequest request, @RequestBody Employee employee){
        log.info(employee.toString());
//        Long emId = (Long) request.getSession().getAttribute("employee");

//        employee.setUpdateTime(LocalDateTime.now());
//        employee.setUpdateUser(emId);

        employeeService.updateById(employee);
        return R.success("员工信息修改成工");

    }


    @GetMapping("/{id}")
    public R<Employee> getById(@PathVariable Long id){
        log.info("根据id查询员工信息.....");

        Employee employee = employeeService.getById(id);
        if (employee != null){
            return R.success(employee);
        }
        return R.error("没有查询到员工信息..");
    }



}

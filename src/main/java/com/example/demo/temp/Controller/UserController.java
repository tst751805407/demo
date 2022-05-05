package com.example.demo.temp.Controller;


import com.example.demo.temp.User;
import com.example.demo.temp.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author TTT
 */
@RestController
@RequestMapping("/user")
//说明接口文件
@Api(value = "测试接口", tags = "用户管理相关的接口", description = "用户测试接口")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 保存数据
     * @param user
     * @return
     */
    @PostMapping(value = "/save")
    //方法参数说明，name参数名；value参数说明，备注；dataType参数类型；required 是否必传；defaultValue 默认值
    @ApiImplicitParam(name = "user", value = "新增用户数据")
    //说明是什么方法(可以理解为方法注释)
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public String saveUser(User user){
        userService.save(user);
        return "保存成功";
    }

//    /**
//     * 根据id查询用户
//     * @param id
//     * @return
//     */
//    @GetMapping(value = "findById")
//    @ApiOperation(value = "根据id获取用户信息", notes = "根据id查询用户信息")
//    public User getUser(Integer id){
//        return userService.findById(id);
//    }
//
//    @DeleteMapping(value = "deleteById")
//    @ApiOperation(value = "根据id删除数据", notes = "删除用户")
//    public String delete(Integer id){
//        userService.deleteById(id);
//        return "删除成功";
//    }
}

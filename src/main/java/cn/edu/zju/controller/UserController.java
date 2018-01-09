package cn.edu.zju.controller;

import cn.edu.zju.entity.User;
import cn.edu.zju.result.ReturnResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by succe on 2018/1/9.
 */
@Api(value = "User控制器")
@Controller
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = ReturnResult.class)
    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET, produces = "application/json")
    public ReturnResult queryUserById(@ApiParam(name = "userId", required = true, value = "用户Id")
                                @RequestParam("userId") int userId,
                                HttpServletRequest request) {
        User user = new User();
        user.setId(userId);
        user.setUsername("xiaoming");
        user.setPassword("123456");

        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(0);
        returnResult.setData(user);
        returnResult.setMessage("success");

        return returnResult;
    }
}

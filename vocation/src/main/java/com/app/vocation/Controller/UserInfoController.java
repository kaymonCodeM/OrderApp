package com.app.vocation.Controller;

import com.app.vocation.Entity.UserInfo;
import com.app.vocation.Service.UserInfoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserInfoController implements CrudController<UserInfo> {

    @Autowired
    private UserInfoServiceImp userInfoServiceImp;

    @GetMapping("/userInfo/all")
    @Override
    public List<UserInfo> findAll() {
        return userInfoServiceImp.findAll();
    }

    @PostMapping("/userInfo/add")
    @Override
    public UserInfo add(@RequestBody UserInfo elm) {
        return userInfoServiceImp.add(elm);
    }

    @DeleteMapping("/userInfo/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return userInfoServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/userInfo/get/{id}")
    @Override
    public UserInfo getById(@PathVariable String id) {
        return userInfoServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("/userInfo/update")
    @Override
    public UserInfo update(@RequestBody UserInfo elm) {
        return userInfoServiceImp.add(elm);
    }
}

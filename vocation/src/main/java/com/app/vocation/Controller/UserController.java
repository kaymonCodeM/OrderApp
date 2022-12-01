package com.app.vocation.Controller;

import com.app.vocation.Entity.User;
import com.app.vocation.Service.MyUserDetailsServiceImp;
import com.app.vocation.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController implements CrudController<User> {
    @Autowired
    private MyUserDetailsServiceImp myUserDetailsServiceImp;

    @Autowired
    private TokenService tokenService;


    @PostMapping("/token")
    public String token(Authentication authentication){
        return tokenService.generateToken(authentication);
    }

    @GetMapping("/user/all")
    @Override
    public List<User> findAll() {
        return myUserDetailsServiceImp.findAll();
    }

    @PostMapping("/user/add")
    @Override
    public User add(@RequestBody User elm) {
        return myUserDetailsServiceImp.add(elm);
    }

    @DeleteMapping("/user/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return myUserDetailsServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/user/get/{id}")
    @Override
    public User getById(@PathVariable String id) {
        return myUserDetailsServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("/user/update")
    @Override
    public User update(@PathVariable User elm) {
        return myUserDetailsServiceImp.update(elm);
    }
}

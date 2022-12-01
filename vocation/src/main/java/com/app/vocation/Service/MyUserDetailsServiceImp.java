package com.app.vocation.Service;

import com.app.vocation.Entity.MyUserDetails;
import com.app.vocation.Entity.User;
import com.app.vocation.Entity.UserInfo;
import com.app.vocation.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailsServiceImp implements MyUserDetailsService,CrudService<User> {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserInfoServiceImp userInfoServiceImp;


    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User add(User elm) {
        Optional<User> u = userRepo.findByUsername(elm.getUsername());
        if(u.isEmpty()){
            String passwordEncode = passwordEncoder.encode(elm.getPassword());
            elm.setPassword(passwordEncode);
            return userRepo.save(elm);
        }
        return null;
    }

    @Override
    public User update(User elm) {
        Optional<User> u = userRepo.findByUsername(elm.getUsername());

        String passwordEncode = passwordEncoder.encode(elm.getPassword());
        elm.setPassword(passwordEncode);

        if(u.isEmpty()){
            return userRepo.save(elm);
        }else if(u.get().getUserId()==elm.getUserId()){
            return userRepo.save(elm);
        }
        return null;
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        UserInfo userInfo = findById(id).getUserInfo();
        if(userInfo!=null){
            userInfoServiceImp.delete(userInfo.getUserInfoId());
        }
        userRepo.deleteById(id);
        return "User deleted by id: "+ id;
    }

    @Override
    public PasswordEncoder getEncoder() {
        return this.passwordEncoder;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username)
                .map(MyUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("Username not found: " + username));
    }
}

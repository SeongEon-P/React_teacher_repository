package org.mysite.shopbackend.controller;

import lombok.RequiredArgsConstructor;
import org.mysite.shopbackend.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

//  @GetMapping("/home")
//  public String home(){
//    return "Hello World";
//  }
//  @PostMapping("/user")
//  public User saveUser(@RequestBody User user){
//    return userService.saveUser(user);
//  }
//  @GetMapping("/user/{username}")
//  public User findByUsernaem(@PathVariable String username){
//    return userService.findByUsername(username).orElseThrow();
//  }
//  @GetMapping("/allUser")
//  public List<User> allUser(){
//    return userService.userAll();
//  }
//  @PutMapping("user")
//  public void changeRole(@RequestBody User user){
//    userService.changeRole(user.getRole(), user.getUsername());
//  }
}

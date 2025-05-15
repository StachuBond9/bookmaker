package com.stanislawwocjik.bookmaker.api;


import com.stanislawwocjik.bookmaker.api.request.CreateUserRequest;
import com.stanislawwocjik.bookmaker.domain.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    ResponseEntity<Void> registration(@RequestBody CreateUserRequest createUserRequest){
        userService.createUser(createUserRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

package com.stanislawwocjik.bookmaker.domain;

import com.stanislawwocjik.bookmaker.api.request.CreateUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserRequest request) {
        User user = new User(request.login(), request.firstName(), request.lastName(), request.eMail(), request.identityCard());
        int statusCode = registerAuth(request.login(), request.password());
        if(statusCode == 400){
            throw new RuntimeException("Invalid login or password");
        }if(statusCode == 201){
            userRepository.save(user);
        }
    }

    private int registerAuth(String login , String password ){
        RegisterAuthRequest registerAuthRequest = new RegisterAuthRequest(login, password);
        return webClient.post()
                .uri("/registration")
                .bodyValue(registerAuthRequest)
                .exchangeToMono(clientResponse -> Mono.just(clientResponse.statusCode().value()))
                .block();
    }
}

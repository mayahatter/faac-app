package com.faac;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.faac.spring.datajpa.controller.UserController;
import com.faac.spring.datajpa.model.User;
import com.faac.spring.datajpa.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserServiceTests {
    @Mock
    private UserRepository userRepository;
    
    @InjectMocks
    private UserController userController;

    @Test
    void insertUserAndReturnLoggedUsers() {
        User user = new User("pippo", "pippo", "disney", "pippo@gmail.com");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.save(any())).then(returnsFirstArg());

        ResponseEntity<User> response = userController.updateUser(1L, new User("pippo2", "pippo2", "disney2", "pippo2@gmail.com"));
        User userUpdated = response.getBody();

        assertThat("pippo2".equalsIgnoreCase(userUpdated.getUsername()));
        assertThat("disney2".equalsIgnoreCase(userUpdated.getCognome()));
    }

}
package com.stanislawwocjik.bookmaker.infrastructure;

import com.stanislawwocjik.bookmaker.domain.user.User;
import com.stanislawwocjik.bookmaker.domain.user.UserRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;

@Repository
public class UserEntityRepository implements UserRepository {
    private final UserEntityRepositorySpring userEntityRepository;

    public UserEntityRepository(UserEntityRepositorySpring userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public void save(User user) {
        userEntityRepository.save(userToUserEntity(user));
    }
    static UserEntity userToUserEntity(User user){
        return new UserEntity(user.login(), user.firstName(), user.lastName(), user.eMail(),  user.identityCard(), new BigDecimal(0));
    }

}

package org.develop.demo.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Account save(Account account) {
        return userRepository.save(account);
    }

    public Account findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}

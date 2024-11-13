package org.develop.demo.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestApi {
    private final UserService userService;

    @GetMapping("/account/save")
    public Account save() {
        Account account = new Account();
        return userService.save(account);
    }

    @GetMapping("/account/find")
    public Account find(Long id) {
        return userService.findById(id);
    }

    @GetMapping("/account/delete")
    public void delete(Long id) {
        userService.delete(id);
    }
}

package hello.springmvc.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * User list        : GET       '/users'
     * User create      : POST      '/users'
     * User retrieve    : GET       '/users/{userId}'
     * User update      : PATCH     '/users/{userId}'
     * User delete      : DELETE    '/users/{userId}'
     */

    @GetMapping
    public String findUsers() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "add user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId " + userId;
    }
}

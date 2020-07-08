package hello;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/admin")
    @Secured("ROLE_ADMIN")
    public String admin() {
        return "Admin";
    }

    @GetMapping("/user")
    @Secured("ROLE_USER")
    public String user() {
        return "User";
    }
}

package fi.tamk.mariadb_demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  private final UserRepository repo;

  public UserController(UserRepository repo) {
    this.repo = repo;
  }

  @PostMapping("/users")
  public User create(@RequestParam String email) {
    return repo.save(new User(email));
  }
}

package projeto.lojaTech.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.lojaTech.entities.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<ArrayList<User> > findAll() {
        User u = new User("João", "jgpschianti07@gmail.com", "+5543998664156", "1234");
        User u2 = new User("Thauane", "vinh0gostos0@gmail.com", "+554399756231", "4321");
        ArrayList<User> list = new ArrayList<User>();
        list.add(u);
        list.add(u2);

        return ResponseEntity.ok().body(list);
    }
}

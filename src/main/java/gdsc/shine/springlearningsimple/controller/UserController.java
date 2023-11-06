package gdsc.shine.springlearningsimple.controller;


import gdsc.shine.springlearningsimple.dao.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private static final int INIT_COUNT = 1;

    private final UserDAO userDAO;

    @GetMapping("/users")
    public ResponseEntity<String> findUserByName(@RequestParam String name) {
        userDAO.insertUserByName(name);

        int visitCount = userDAO.countByUserName(name);

        if(visitCount == -1){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("잘못된 요청입니다.");
        }

        if (visitCount == INIT_COUNT){
            return ResponseEntity.ok("안녕하세요! " + name);
        }

        return ResponseEntity.ok(name + "님 안녕하세요, " + visitCount + "번째 방문이시군요!");
    }
}

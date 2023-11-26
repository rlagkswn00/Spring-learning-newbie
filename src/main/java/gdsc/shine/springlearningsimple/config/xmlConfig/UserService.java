package gdsc.shine.springlearningsimple.config.xmlConfig;

public class UserService {

    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String sayHello() {
        return "hello";
    }

    public String sayHi() {
        return userRepository.sayHi();
    }
}

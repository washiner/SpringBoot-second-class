package br.com.washiner.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 modificadores
 public - acesso a todo local
 private - acesso local
 protected - chama em lugar expecifico

 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired // spring vai se vira pra instanciar 
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel){
       var user = this.userRepository.findByUsername(userModel.getUsername());

       if(user != null){
        System.out.println("Usuario ja Existe");
        return null;
       }else{
        System.out.println("Usuario inserido no banco de dados");
       }
       var userCreated = this.userRepository.save(userModel);
       return userCreated;
    }
    
}

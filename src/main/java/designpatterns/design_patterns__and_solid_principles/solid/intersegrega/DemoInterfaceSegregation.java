package designpatterns.design_patterns__and_solid_principles.solid.intersegrega;

import designpatterns.design_patterns__and_solid_principles.solid.intersegrega.entity.User;
import designpatterns.design_patterns__and_solid_principles.solid.intersegrega.service.UserPersistenceService;

import java.time.LocalDateTime;
import java.util.List;

public class DemoInterfaceSegregation {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Volodymyr");
        user.setLastLogin(LocalDateTime.of(2021, 12, 12, 23, 35, 59));
        System.out.println(user.getLastLogin());

        // save user
        UserPersistenceService service = new UserPersistenceService();
        service.save(user);

        // find user
        List<User> userVolodymyr = service.findByName("Volodymyr");
        if (!userVolodymyr.isEmpty()) {
            System.out.println(userVolodymyr.get(0).getName() + " : " + userVolodymyr.get(0).getLastLogin());
        }

        // delete user
        service.delete(user);
        List<User> list = service.findByName("Volodymyr");
        System.out.println(list);


    }

}

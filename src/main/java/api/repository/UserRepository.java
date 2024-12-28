package api.repository;

import common.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

// ToDo:  Make a description for the swagger Documentation
@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}

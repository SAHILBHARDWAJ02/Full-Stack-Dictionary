package com.company.sahil_signup.Respository;

import com.company.sahil_signup.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , String> {
}

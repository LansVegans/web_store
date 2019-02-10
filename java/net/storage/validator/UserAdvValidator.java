package net.storage.validator;

import net.storage.entities.UserAdv;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validator for {@link net.storage.entities.UserAdv} class,
 * implements {@link Validator} interface.
 *
 * @author Egor
 * @version 1.0
 */
public class UserAdvValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
       return UserAdv.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {


    }
}

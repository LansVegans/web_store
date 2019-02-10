package net.storage.controller;

import net.storage.entities.User;
import net.storage.entities.UserAdv;
import net.storage.service.*;
import net.storage.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for {@link net.storage.entities.User}'s pages.
 *
 * @author Egor
 * @version 1.0
 */

@Controller
public class UserController {
    @Autowired
    CartService cartService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotebookService notebookService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserAdvService userAdvService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out successfully.");
        }

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public String admin(Model model) {
        model.addAttribute("notebook", notebookService.getAll());
        return "catalog";
    }
    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public String signup( Model model){
        model.addAttribute("signupForm",new UserAdv());
        return "account";
    }
    @RequestMapping(value = "/account",method = RequestMethod.POST)
    public String signup(@ModelAttribute("signupForm") UserAdv userForm, BindingResult bindingResult, Model model){
        userAdvService.save(userForm);
        return "account";
    }

}

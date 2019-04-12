package com.example.fSpring.controller;

//@Controller
//public class RegistrationController {

//    @Autowired
//    private UserRepo userRepo;
//
//    @GetMapping("/registration")
//    public String registration() {
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String addUser(User user, Map<String, Object> model) {
//        User userFromDb = userRepo.findByUsername(user.getUsername());
//
//        if (userFromDb != null) {
//            model.put("message", "User Exists!");
//            return "registration";
//        }
//
//        user.setActive(true);
//        user.setRoles(Collections.singleton(Role.USER));
//        userRepo.save(user);
//
//        return "redirect:/login";
//    }
//}

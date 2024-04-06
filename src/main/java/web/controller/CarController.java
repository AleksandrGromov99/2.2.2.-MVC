package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;


    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

//    @GetMapping("/cars")
//    public String show(@PathVariable("id") int id, Model model) {
//        model.addAttribute("cars", carService.show(id));
//        return "/cars";
//    }

    @GetMapping("")
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count!=null){
            model.addAttribute("cars", carService.show(count));
        } else {
            model.addAttribute("cars",carService.show(10));
        }
        return "/cars";
    }
}

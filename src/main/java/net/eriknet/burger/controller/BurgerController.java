package net.eriknet.burger.controller;

import net.eriknet.burger.dto.BurgerResponseDto;
import net.eriknet.burger.dto.ComboBurgerResponseDto;
import net.eriknet.burger.model.Bread;
import net.eriknet.burger.mapper.BurgerMapper;
import net.eriknet.burger.mapper.ComboBurgerMapper;
import net.eriknet.burger.model.Meat;
import net.eriknet.burger.mapper.ToppingMapper;
import net.eriknet.burger.model.Burger;
import net.eriknet.burger.model.ComboBurger;
import net.eriknet.burger.service.BurgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BurgerController {

    @Autowired
    BurgerService service;

    @RequestMapping(value = "basic-burger", method = RequestMethod.GET)
    public BurgerResponseDto basicBurger(@RequestParam("meat") String meat,
                                         @RequestParam("bread") String bread,
                                         @RequestParam(value ="topping", required = false, defaultValue = "")
                                                     List<String> toppings) {
        Burger burger = service.createBasicBurger(Meat.valueOf(meat), Bread.valueOf(bread),
                ToppingMapper.toToppings(toppings));
        return BurgerMapper.toDto(burger);
    }

    @RequestMapping(value = "healthy-burger", method = RequestMethod.GET)
    public BurgerResponseDto healthyBurger(@RequestParam("meat") String meat,
                                           @RequestParam("bread") String bread,
                                           @RequestParam(value ="topping", required = false, defaultValue = "")
                                                       List<String> toppings) {
        Burger burger =  service.createHealthyBurger(Meat.valueOf(meat), Bread.valueOf(bread),
                ToppingMapper.toToppings(toppings));
        return BurgerMapper.toDto(burger);
    }

    @RequestMapping(value = "combo-burger", method = RequestMethod.GET)
    public ComboBurgerResponseDto comboBurger(@RequestParam("meat") String meat,
                                              @RequestParam("bread") String bread,
                                              @RequestParam(value ="topping", required = false, defaultValue = "")
                                                          List<String> toppings) {
        ComboBurger burger =  service.createComboBurger(Meat.valueOf(meat), Bread.valueOf(bread),
                ToppingMapper.toToppings(toppings));
        return ComboBurgerMapper.toDto(burger);
    }
}

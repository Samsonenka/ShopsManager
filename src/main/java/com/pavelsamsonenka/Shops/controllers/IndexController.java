package com.pavelsamsonenka.Shops.controllers;

import com.pavelsamsonenka.Shops.models.Shop;
import com.pavelsamsonenka.Shops.repos.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ShopRepo shopRepo;

    @GetMapping("/")
    public String index(ModelMap modelMap){

        modelMap.put("shopList", shopRepo.findAll());

        return "index";
    }

    @GetMapping("/addShop")
    public String addShop(ModelMap modelMap){

        return "addshop";
    }

    @PostMapping("/addShop")
    public String addShop(@RequestParam String shopName,
                          @RequestParam String shopCity,
                          @RequestParam String shopAddress, ModelMap modelMap){

        Shop shop = new Shop(shopName, shopCity, shopAddress);
        shopRepo.save(shop);

        modelMap.put("shopList", shopRepo.findAll());

    return "index";
    }

}

package com.bozkurt.todolist.controller;

import com.bozkurt.todolist.model.ListItem;
import com.bozkurt.todolist.model.User;
import com.bozkurt.todolist.model.UserList;
import com.bozkurt.todolist.service.ListItemService;
import com.bozkurt.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ListItemService listItemService;

    @Autowired
    private UserService userService;

    @RequestMapping( value = {"/", "/index"})
    public String home(Model model) {

        List<ListItem> todolist = listItemService.findAll();
        model.addAttribute("todolist",todolist);
        return "index";
    }
}

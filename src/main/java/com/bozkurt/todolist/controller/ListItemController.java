package com.bozkurt.todolist.controller;

import com.bozkurt.todolist.dto.AddItemDto;
import com.bozkurt.todolist.dto.DeleteItemDto;
import com.bozkurt.todolist.model.ListItem;
import com.bozkurt.todolist.model.User;
import com.bozkurt.todolist.model.UserList;
import com.bozkurt.todolist.service.ListItemService;
import com.bozkurt.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListItemController {

    @Autowired
    private ListItemService listItemService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listItem", method = RequestMethod.POST)
    public ResponseEntity<ListItem> addItem(Model model, @RequestBody AddItemDto addItemDto) {

        User user = userService.findById(1);

        ListItem listItem = new ListItem();
        listItem.setText(addItemDto.getItemText());
        listItem.setStatus("ACTIVE");
        listItem.setUserList(user.getUserLists().get(0));

        listItemService.save(listItem);

        return new ResponseEntity<ListItem>(listItem, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/listItem", method = RequestMethod.DELETE)
    public ResponseEntity removeItem(Model model, @RequestBody DeleteItemDto deleteItemDto) {

        listItemService.delete(deleteItemDto.getItemId());
        return new ResponseEntity(HttpStatus.OK);
    }
}

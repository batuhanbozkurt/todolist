package com.bozkurt.todolist;

import com.bozkurt.todolist.dto.AddItemDto;
import com.bozkurt.todolist.model.ListItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TodolistApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void addItem() {
        AddItemDto addItemDto = new AddItemDto();
        addItemDto.setItemText("Test Task");
        ResponseEntity<ListItem> responseEntity =
                restTemplate.postForEntity("/listItem", addItemDto, ListItem.class);
        ListItem listItem = responseEntity.getBody();
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals("Test Task", listItem.getText());
    }
}

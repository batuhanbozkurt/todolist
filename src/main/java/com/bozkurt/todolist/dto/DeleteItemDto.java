package com.bozkurt.todolist.dto;

public class DeleteItemDto {
    long itemId;

    public DeleteItemDto(){}

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}

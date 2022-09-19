package com.minui.borrowthing.model;

import java.io.Serializable;
import java.util.List;

public class BorrowResult implements Serializable {
    private String result;
    private int count;
    private List<item> items;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<item> getItems() {
        return items;
    }

    public void setItems(List<item> items) {
        this.items = items;
    }
}

package com.todo.service;
import java.util.*;

import com.todo.dao.TodoItem;

public class TodoSortByLevel implements Comparator<TodoItem>{
	
	@Override
    public int compare(TodoItem o1, TodoItem o2) {
        return o1.getLevel() - o2.getLevel();

	}

}


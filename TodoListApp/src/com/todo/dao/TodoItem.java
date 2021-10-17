package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
	private String title;
    private String desc;
    private SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private String current_date;
    private String category;
    private String due_date;
    private int id;
    private int is_completed;
    // 우선순위 정도 1~5 정수, 난이도 정도 1~5 정수.
    private int priority;
    private int level;
    
	public int getIs_completed() {
		return is_completed;
	}

	public void setIs_completed(int is_completed) {
		this.is_completed = is_completed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ". [" + category + "] " + title + " - "+ desc + " - " + due_date + " - " + current_date + " [" + priority + "순위]" + " [난이도:" + level + "]";
	}
    
	public String toSaveString() {
		return "##" + category + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + "##" + priority + "##" + level + "\n";
	}

    public TodoItem(String title, String desc, String category, String due_date, int priority, int level){
        this.title=title;
        this.desc=desc;
        this.current_date=f.format(new Date());
        this.category = category;
        this.due_date = due_date;
        this.priority = priority;
        this.level = level;
    }
    
    public String getTitle() {
        return title;
    }
    
    public TodoItem(String title, String desc, String category, String due_date, int priority, int level, int is_completed) {
		super();
		this.title = title;
		this.desc = desc;
		this.category = category;
		this.due_date = due_date;
		this.priority = priority;
		this.level = level;
		this.is_completed = is_completed;
	}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
package com.test.rest.restwebservices.todo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Todo {
	private String name;
	private long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	private String desc;
	private boolean isDone;
	
	public Todo(String name, long id, String desc, boolean isDone) {
		super();
		this.name = name;
		this.id = id;
		this.desc = desc;
		this.isDone = isDone;
	}

}

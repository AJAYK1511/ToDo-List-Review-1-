package com.example.demo.verify;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class Verify
{
	@Id
	private int id;
	@Column(name="NAME")
	private String nameString;
	@Column(name="ISCOMPLETE")
	private boolean isComplete;
	public Verify(int id, String nameString, boolean isComplete) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.isComplete=isComplete;
	}
	public Verify() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
}

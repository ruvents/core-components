package com.ruvents.components.builders;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T>
{
	private final ArrayList<T> list
		= new ArrayList<>();
	
	public static ListBuilder<String> create() {
		return new ListBuilder<>();
	}
	
	public ListBuilder<T> add(@NonNull T value) {
		list.add(value);
		return this;
	}
	
	public ListBuilder<T> addSafe(T value) {
		if (value != null)
			list.add(value);
		
		return this;
	}
	
	public List<T> build() {
		return list;
	}
}

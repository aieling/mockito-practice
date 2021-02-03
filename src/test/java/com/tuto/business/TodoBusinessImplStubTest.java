package com.tuto.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.tuto.data.api.TodoService;
import com.tuto.data.api.TodoServiceStub;
import com.tuto.data.business.TodoBusinessImpl;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		assertEquals("Learn Spring MVC", todos.get(0));
		assertEquals("Learn Spring", todos.get(1));
	}
	

	
	

}

package com.tuto.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testListSize() {
		List listMock = mock(List.class);
		listMock.size();
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}

	@Test
	public void testListSize_ReturnMultipleValues() {
		List listMock = mock(List.class);
		listMock.size();
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	@Test
	public void testMockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("toto");
		assertEquals("toto",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	
	@Test
	public void testMockListGetWithAny() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("hello");
		assertEquals("hello",listMock.get(0));
		assertEquals("hello",listMock.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void testMockThrowAnException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		listMock.get(0);
	}


}

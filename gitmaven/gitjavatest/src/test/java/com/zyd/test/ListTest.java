package com.zyd.test;

import org.junit.Test;

import com.zyd.node.LinkedList;

public class ListTest {
	
	@Test
	public void add(){
		LinkedList link = new LinkedList();
		link.add(5);
		link.add(7);
		link.add(0);
		link.linkPrintln();
	}
	
}

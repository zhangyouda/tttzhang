package com.zyd.node;

public class LinkedList {
	
	Node head = null;//链表头的引用
	
	/**
	 * 向链表插入数据
	 * @param data
	 */
	public void add(int data){
		Node newNode = new Node(data);
		
		if(head == null) {//判断head是否为空，为空则将newNode设置为链表头
			head = newNode;
			return;
		}
		
		Node tmp = head;
		while(tmp.next != null){//循环查找直到为空
			tmp = tmp.next;
		}
		//将尾引用赋值newNode
		tmp.next = newNode;
	}
	
	
	public void linkPrintln(){
		if(head == null){
			System.out.println("null");
			return;
		}
		Node tmp = head;
		while(tmp != null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
}

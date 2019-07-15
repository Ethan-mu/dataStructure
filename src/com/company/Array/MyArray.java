package com.company.Array;

public class MyArray {
	private int[] data;
	private int size;

	/**
	 * 构造函数，传入数组的容量capacity
	 * @param capacity
	 */
	public MyArray(int capacity){
		data = new int[capacity];
		size=0;
	}
	public MyArray(){
//		data=new int[10];
//		size=0;
		this(10);
	}

	/**
	 * 获取数组中元素的个数
	 * @return
	 */
	public int getSize(){
		return size;
	}
	/**
	 * 获取数组的容量
	 */
	public int getCapacity(){
		return data.length;
	}

	/**
	 * 数组是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return size==0;
	}

	/**
	 * 向数组末尾中添加元素
	 */
	public void addLast(int e){
		data[size]=e;
		size++;
	}

	/**
	 * 向数组指定位置插入元素
	 */
	public void add(int index,int e){

		if(size==data.length){
			throw new IllegalArgumentException("Array is full");
		}
	}



}

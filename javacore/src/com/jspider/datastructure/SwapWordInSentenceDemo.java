package com.jspider.datastructure;

public class SwapWordInSentenceDemo {
	static StringBuffer sb=new StringBuffer("He is a good   boy");
	public static void main(String[] args) {
		System.out.println(sb);
		int i=0,j=0,w=0;
		while (i< sb.length()) {
			if (i==0) {
				w=0;
			}
			if(sb.charAt(i)== ' ' || i==sb.length()-1){
				j=i;
				if (i==sb.length()-1) {
					j=i;
				} else {
					j--;
				}
				swap(w,j);
				w=i+1;
			}
			i++;
		}
		swap(0,sb.length()-1);
		System.out.println(sb);
	}


	static void swap(int i,int j){
		while (i < j) {
			char ch=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;j--;
		}
	}
}


package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        
        MyStack<Character> stack = new LinkedListStack<>();
        boolean seguir=true;
        for(int i=0;i<s.length()&&seguir;i++) {
        	char c=s.charAt(i);
        	if(c=='(' || c=='{' || c=='[' ) {
        		stack.push(c);
        	}
        	else if (c==')' ) {
        		char aux=stack.pop();
        		if (aux!='(' ) {seguir =false;
        		break;}
        	}
        	else if (c=='}' ) {
        		char aux=stack.pop();
        		if (aux!='{' ) {seguir =false;
        		break;}
        	}
        	else if (c==']' ) {
        		char aux=stack.pop();
        		if (aux!='[' ) {seguir =false;
        		break;
        	}
        }}
        seguir = stack.isEmpty() && seguir;
        if(seguir)return seguir;
        else return seguir;

        //return seguir;
    

    }
}

package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
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

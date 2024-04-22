package com.example.androidprojectcollection;

import java.util.Collections;
import java.util.Stack;
public class Calculator {
    Stack<Double> operands = new Stack();
    Stack<Character> operators = new Stack();


    public String mdasCalculate(String value) {
        StringBuilder result = new StringBuilder();
        double a, b;
        //operations
        for (char c : value.toCharArray()) {
            if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
                operands.push(Double.valueOf(result.toString()));
                result.delete(0, result.capacity());
                if (!operators.empty() && getOrderPrecedence(operators.peek()) >= getOrderPrecedence(c)) {
                    b = operands.pop();
                    a = operands.pop();
                    operands.push(operate(a, b, operators.pop()));
                }
                operators.push(c);
            } else {
                result.append(c);
            }
        }
        operands.push(Double.valueOf(result.toString()));
        result.delete(0, result.capacity());
        while (!operators.empty()) {
            b = operands.pop();
            a = operands.pop();
            operands.push(operate(a, b, operators.pop()));
        }
        result.append(operands.pop());
        return result.toString();
    }
    public String calculate(String value){
        char v = value.charAt(value.length()-1);
        if((v == '+') || (v == '-') || (v == '*') || (v == '/')){
            value = value.substring(0, value.length()-1);
            System.out.println(value);
        }
        StringBuilder result = new StringBuilder();
        double a, b;
        //operations
        for (char c : value.toCharArray()) {
            if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
                operands.push(Double.valueOf(result.toString()));
                result.delete(0, result.capacity());
                operators.push(c);
            } else {
                result.append(c);
            }
        }

        operands.push(Double.valueOf(result.toString()));
        result.delete(0, result.capacity());

        operands.sort(Collections.reverseOrder());
        reverseOperator();
        while (!operators.empty()) {
            b = operands.pop();
            a = operands.pop();
            operands.push(operate(a, b, operators.pop()));
        }
        result.append(operands.pop());
        return result.toString();
    }
    private int getOrderPrecedence(char c) {
        switch (c) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
        }
        return -1;
    }
    private void reverseOperator(){
        Stack<Character> reverse = new Stack<>();
        int size = operators.size();
        for(int i = 0; i < size; i++){
            reverse.push(operators.pop());
        }
        operators = reverse;
    }
    private double operate(double a, double b, char operator) {
        switch (operator) {
            case '-':
                return a - b;
            case '+':
                return a + b;
            case '/':
                return a / b;
            case '*':
                return a * b;
        }
        return 0;
    }
}
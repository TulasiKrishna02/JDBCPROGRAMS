package com.nani.www;

import java.util.Stack;

class Nani
{
public boolean isValid(String s)
{
Stack<Character> stack=new Stack<>();
for(char c:s.toCharArray())
{

if(c=='(')
	stack.push(')');
else if(c=='{')
	stack.push('}');
else if(c=='[')
    stack.push(']');
else if(stack.isEmpty() ||stack.pop() != c)
    return false;

}

return stack.isEmpty();
}
public static void main(String args[])
{
Nani s=new Nani();
s.isValid("[{}]");

}

}

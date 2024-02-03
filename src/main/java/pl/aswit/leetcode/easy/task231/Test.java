package pl.aswit.leetcode.easy.task231;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        MyStack a = new MyStack();
        a.push(1);
        a.push(2);
        a.push(3);
         a.top();
         a.pop();
         a.top();
         a.pop();
         a.top();
         a.empty();
         a.pop();
         a.empty();
    }

}

package com.ohgiraffers.section01.literal;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 문자열 합치기 결과를 예측하고 사용할 수 있다.*/
        /* 목차. 1. 두 개의 문자열 합치기 */
        System.out.println("================두 개의 문자열 합치기====================");
        System.out.println(9+9);        //값 = 18
        System.out.println("9"+9);        //값 = 99
        System.out.println(9+"9");        //값 = 99
        System.out.println("9"+"9");        //값 = 99

        /* 목차. 2. 세 개의 문자열 합치기 */
        System.out.println("====================세 개의 문자열 합치기=======================");
        System.out.println(9+9+"9");        //일반적 연산을 한 9+9인 18과 문자인 9가 나타나게 된 것
        System.out.println(9+"9"+9);      //순서대로 감 그냥 숫자 사이에 문자가 들어감

        System.out.println("9"+9+9);        //이 결과를 918로 만들고 싶다. 항상 왼쪽부터 더해지기 때문에 문자열이 붙으면 다 흡수해버림. 문자열 9에 숫자 9를 더한 99에 9 더함 >999
        System.out.println("9"+(9+9));        //이 결과 918

        System.out.println("============10과 20의 사칙연산 결과 보기 좋게 출력하기================");
        System.out.println("10과 20의 합:"+(10+20));       //괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다
        System.out.println("10과 20의 합:"+10+20);


    }
}

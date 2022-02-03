package com.harbour.thirdlecture.classesandinterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Barista {

    public static void main(String[] args) {


        var tea = new Tea();
        tea.prepare();


        var coffee = new Coffee();
        coffee.prepare();

        var cacao = new Cacaco();
        cacao.prepare();
    }
}

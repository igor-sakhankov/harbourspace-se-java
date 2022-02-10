package com.harbour.thirdlecture.classesandinterfaces;

public class Barista {

    private static void prepareDring() {
        var tea = new Tea();
        tea.prepare();

        var coffee = new Coffee();
        coffee.prepare();

        var cacao = new Cacaco();
        cacao.prepare();
    }
}

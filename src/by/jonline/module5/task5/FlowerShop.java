package by.jonline.module5.task5;
/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 (объект, представляющий собой цветочную композицию).
  Составляющими цветочной композиции являются цветы и упаковка.
 */

import by.jonline.module5.task5.been.FlowersComposition;
import by.jonline.module5.task5.been.flower.FlowerFactory;
import by.jonline.module5.task5.been.packaging.PackagingFactory;
import by.jonline.module5.task5.been.packaging.TypePackaging;
import by.jonline.module5.task5.logic.FlowersCompositionLogic;
import by.jonline.module5.task5.logic.FlowersFactory;
import by.jonline.module5.task5.logic.PackagFactory;
import by.jonline.module5.task5.view.CompositionView;

public class FlowerShop {
    public static void main(String[] args) {
        FlowersComposition composition = new FlowersComposition();
        FlowersCompositionLogic logic = new FlowersCompositionLogic();
        FlowerFactory factory = new FlowersFactory();
        PackagingFactory packaging = new PackagFactory();
        CompositionView view = new CompositionView();
        composition.setFlowers(factory.createFlower("rose"),
                factory.createFlower("lily"),
                factory.createFlower("chamomile"));
        composition.setPackaging(packaging.createPackaging(TypePackaging.CRAFT));
        view.print(composition);
        System.out.println("Total price " + logic.getTotalPrice(composition));
    }
}

package com.wen.object;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 14:20
 * @description:
 */
public class Hero {

    String name="123"; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero(){
        this.name="kitty";
    }
    {
        this.name = "heney";
    }
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero h){
        h = new Hero("提莫",383);
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        Hero teemo =  new Hero("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp);
        System.out.println(hero.name);
    }

}


package com.wen.number;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 15:50
 * @description:
 * 浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，
 * 带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，
 * 现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，
 * 你不发工资，你还我血汗钱，还我血汗钱!
 */
public class FormatPrint {
    public static void main(String[] args) {
        String formatStr = "%s最大%s %s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%f个亿，" +
                "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的钱包，" +
                "现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，" +
                "你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(formatStr,"浙江温州","皮革厂","江南皮革厂","黄鹤",3.5,"钱包","百","百","百");
    }
}

package study.basic.datatype;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: Integer判等
 * @author: crq
 * @create: 2021-09-26 23:19
 **/
@Slf4j
public class IntegerEquals {
    public static void main(String[] args) {

        //默认存取 指向相同地址
        Integer a = 127;
        Integer b = 127;
        log.info("a == b ? {}", a == b);

        //超出最大 装箱 为new integer() 指向不同的地址
        Integer c = 128;
        Integer d = 128;
        log.info("c == d ? {}", c == d);
        //  自动装箱的代码实现
        //  Java 6 后，最大值映射到 java.lang.Integer.IntegerCache.high
        //  Character 对象也有CharacterCache 缓存 池，范围是 0 到 127。
        //  Byte，Short，Long 的缓存池范围默认都是: -128 到 127
        //  https://blog.csdn.net/maihilton/article/details/80101497
        //  @IntrinsicCandidate 指示编译器将其视为编译时内部化候选项
        //  public static Integer valueOf(int i) {
        //       if (i >= IntegerCache.low && i <= IntegerCache.high)
        //          return IntegerCache.cache[i + (-IntegerCache.low)];
        //       return new Integer(i);
        //  }

        //缓存对象地址 和new地址指向不同
        Integer e = 127;
        Integer f = new Integer(127);
        log.info("" + System.identityHashCode(e));
        log.info("" + System.identityHashCode(f));
        log.info("e == f ? {}", e == f);
        //对象地址指向不同地方
        Integer g = new Integer(127);
        Integer h = new Integer(127);
        log.info("g == h ? {}", g == h);

        ///Integer i 拆箱 变成 int int==为值比较 无论何时都相同
        Integer i = 128;
        int j = 128;
        log.info("i == j ? {}", i == j);
    }

}

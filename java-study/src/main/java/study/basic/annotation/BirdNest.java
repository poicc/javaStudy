package study.basic.annotation;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-10 21:06
 **/
public enum BirdNest {
    /**
     * 麻雀
     */
    Sparrow;
    /**
     * ⻦类繁殖
     *
     * @return Bird
     */
    public Bird reproduce() {
        Desc bd = Sparrow.class.getAnnotation(Desc.class);
        return bd == null ? new Sparrow() : new Sparrow(bd.c());
    }
}

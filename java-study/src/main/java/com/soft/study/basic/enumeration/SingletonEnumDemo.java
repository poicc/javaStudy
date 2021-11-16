package com.soft.study.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 利用枚举实现单例
 * @author: crq
 * @create: 2021-09-29 22:02
 **/
@Slf4j
public class SingletonEnumDemo {
    /**
     * 内部私有枚举
     */
    private enum SingletonEnum {
        /**
         * 枚举实例（单例）
         */
        INSTANCE;
        /**
         * 枚举属性
         */
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.setName("soft");
        log.info(SingletonEnum.INSTANCE.getName());
    }
}

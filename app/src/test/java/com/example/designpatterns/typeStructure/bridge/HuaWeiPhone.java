package com.example.designpatterns.typeStructure.bridge;

public class HuaWeiPhone extends Phone {
    public HuaWeiPhone(Memory memory) {
        super(memory);
    }

    @Override
    public void buy() {
        System.out.println("华为手机： "+memory.addMemory());
    }
}

package com.example.designpatterns.typeStructure.bridge;

public class XiaoMiPhone extends Phone {
    public XiaoMiPhone(Memory memory) {
        super(memory);
    }

    @Override
    public void buy() {
        System.out.println("小米手机:  "+memory.addMemory());
    }
}

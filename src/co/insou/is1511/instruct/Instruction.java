package co.insou.is1511.instruct;

import co.insou.is1511.CPU;

public interface Instruction {

    void execute(CPU cpu);

    default byte mod16(int val) {
        if (val >= 0) {
            return (byte) (val % 16);
        }

        while (val < 0) {
            val += 16;
        }

        return mod16(val);
    }

}

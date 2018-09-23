package co.insou.is1511.instruct.def1b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class DECR_R1_4 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.setR1(mod16(cpu.getR1() - 1));
    }

}

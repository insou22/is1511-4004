package co.insou.is1511.instruct.def1b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class PNT_R0_7 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.output(cpu.getR0());
    }

}

package co.insou.is1511.instruct.def1b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class SUB_R_6 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.setR0(mod16(cpu.getR0() - cpu.getR1()));
    }

}

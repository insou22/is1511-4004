package co.insou.is1511.instruct.def2b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class STR_R1_13 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.nextIP();

        cpu.setByte(cpu.getByte(cpu.getIp()), cpu.getR1());
    }

}

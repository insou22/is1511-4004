package co.insou.is1511.instruct.def2b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class SET_R1_11 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.nextIP();

        cpu.setR1(cpu.getByte(cpu.getIp()));
    }

}

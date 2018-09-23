package co.insou.is1511.instruct.def2b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class JMP_R0NZ_8 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.nextIP();

        if (cpu.getR0() != 0) {
            byte addr = cpu.getByte(cpu.getIp());
            cpu.setIp((byte) (addr - 1));
        }
    }

}

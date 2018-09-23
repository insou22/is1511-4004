package co.insou.is1511.instruct.def2b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class SWAP_R0_14 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.nextIP();

        byte addr = cpu.getByte(cpu.getIp());
        cpu.setSw(cpu.getByte(addr));

        cpu.setByte(addr, cpu.getR0());
        cpu.setR0(cpu.getSw());
    }

}

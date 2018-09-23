package co.insou.is1511;

import co.insou.is1511.instruct.Instruction;
import co.insou.is1511.instruct.Instructions;

import java.util.ArrayList;
import java.util.List;

public class CPU {

    private final ResetInfo info;
    private byte[] bytes;
    private byte r0;
    private byte r1;
    private byte sw;
    private byte ip;
    private byte is;
    private boolean running = true;

    private int count = 0;
    private boolean busted = false;

    private List<Byte> output = new ArrayList<>();

    public CPU(byte[] bytes, byte r0, byte r1) {
        this.info = new ResetInfo(bytes, r0, r1, (byte) 0, (byte) 0, (byte) 0);
        reset();
    }

    public CPU(byte[] bytes, byte r0, byte r1, byte sw, byte ip, byte is) {
        this.info = new ResetInfo(bytes, r0, r1, sw, ip, is);
        reset();
    }

    public List<Byte> run() {
        is = bytes[ip];
        while (running) {
            count++;
            step();

            if (count > 1000) {
                busted = true;
                break;
            }
        }

        return output;
    }

    public void step() {
        Instruction instruction = Instructions.findInstruction(is);
        instruction.execute(this);
        nextIP();
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte getByte(byte index) {
        return bytes[index];
    }

    public void setByte(byte index, byte value) {
        this.bytes[index] = value;
    }

    public byte getR0() {
        return r0;
    }

    public void setR0(byte r0) {
        this.r0 = r0;
    }

    public byte getR1() {
        return r1;
    }

    public void setR1(byte r1) {
        this.r1 = r1;
    }

    public byte getSw() {
        return sw;
    }

    public void setSw(byte sw) {
        this.sw = sw;
    }

    public byte getIp() {
        return ip;
    }

    public void setIp(byte ip) {
        this.ip = ip;
    }

    public byte getIs() {
        return is;
    }

    public void setIs(byte is) {
        this.is = is;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void nextIP() {
        ip++;
        is = bytes[ip];
    }

    public void output(byte value) {
        if (value >= 10) {
            output.add((byte) 1);
            output.add((byte) (value - 10));
        } else {
            output.add(value);
        }
    }

    public boolean isBusted() {
        return busted;
    }

    public void reset() {
        bytes = info.getBytes();
        r0 = info.getR0();
        r1 = info.getR1();
        ip = info.getIp();
        is = info.getIs();
        sw = info.getSw();
        running = true;
        busted = false;
        count = 0;
        output.clear();
    }

}

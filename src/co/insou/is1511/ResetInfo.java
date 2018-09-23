package co.insou.is1511;

public class ResetInfo {

    private final byte[] bytes;
    private final byte r0;
    private final byte r1;
    private final byte sw;
    private final byte ip;
    private final byte is;

    public ResetInfo(byte[] bytes, byte r0, byte r1, byte sw, byte ip, byte is) {
        this.bytes = bytes;
        this.r0 = r0;
        this.r1 = r1;
        this.sw = sw;
        this.ip = ip;
        this.is = is;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public byte getR0() {
        return r0;
    }

    public byte getR1() {
        return r1;
    }

    public byte getSw() {
        return sw;
    }

    public byte getIp() {
        return ip;
    }

    public byte getIs() {
        return is;
    }

}

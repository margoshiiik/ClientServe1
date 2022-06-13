import org.junit.Test;

import static org.junit.Assert.*;

public class PacketTest {
        @Test
        public void testPacket1() {
            Message testMessage = new Message(3, 4, "test");
            Packet packet = new Packet((byte) 1, (long) 4, testMessage);

            byte[] encodedPacket = packet.toPacket();
            try {
                Packet decodedPacket = new Packet(encodedPacket);
                byte[] decPacket = decodedPacket.toPacket();
                assertEquals(packet.getBPktId(), decodedPacket.getBPktId());
                assertEquals(packet.getWCrc16_1(), decodedPacket.getWCrc16_1());
                assertArrayEquals(encodedPacket, decPacket);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    @Test
    public void testPacket2() {
        Message testMessage = new Message(-2222, -323942, "11111111");
        Packet packet = new Packet((byte) 1, (long) 4, testMessage);

        byte[] encodedPacket = packet.toPacket();
        try {
            Packet decodedPacket = new Packet(encodedPacket);
            byte[] decPacket = decodedPacket.toPacket();
            assertEquals(packet.getBPktId(), decodedPacket.getBPktId());
            assertEquals(packet.getWCrc16_1(), decodedPacket.getWCrc16_1());
            assertArrayEquals(encodedPacket, decPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testPacket3() {
        Message testMessage = new Message(0, 0, "");
        Packet packet = new Packet((byte) 0, (long) 0, testMessage);

        byte[] encodedPacket = packet.toPacket();
        try {
            Packet decodedPacket = new Packet(encodedPacket);
            byte[] decPacket = decodedPacket.toPacket();
            assertEquals(packet.getBPktId(), decodedPacket.getBPktId());
            assertEquals(packet.getWCrc16_1(), decodedPacket.getWCrc16_1());
            assertArrayEquals(encodedPacket, decPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

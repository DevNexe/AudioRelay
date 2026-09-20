package defpackage;

import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface yh extends nq4, ReadableByteChannel {
    boolean E();

    String Q(long j);

    void Y(gg ggVar, long j);

    gg a();

    String c0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    mk u(long j);

    void v0(long j);

    long w0();
}

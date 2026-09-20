package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface xh extends bm4, WritableByteChannel {
    xh O();

    xh S(String str);

    xh W(mk mkVar);

    xh X(long j);

    gg a();

    @Override // defpackage.bm4, java.io.Flushable
    void flush();

    xh write(byte[] bArr);

    xh writeByte(int i);

    xh writeInt(int i);

    xh writeShort(int i);

    xh x();
}

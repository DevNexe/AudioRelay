package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class SjP {
    public static final Charset a;
    public static final Charset b;
    public static final byte[] c;

    public interface CQf {
    }

    public interface F1 extends LPt8Fixed<Integer> {
    }

    public interface LPt8Fixed<E> extends List<E>, RandomAccess {
        void i();

        boolean x();
    }

    public interface QnHx {
        int b();
    }

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        c = bArr;
        ByteBuffer.wrap(bArr);
        NUlFixed.d(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class sk {
    public static final AtomicLong a = new AtomicLong(0);
    public static String b;

    public sk(th1 th1Var) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrA = a(time % 1000);
        byte[] bArrA2 = a(a.incrementAndGet());
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrA[0], bArrA[1], bArrA2[0], bArrA2[1], bArrA3[0], bArrA3[1]};
        String strK = kw.k(th1Var.c());
        String strH = kw.h(bArr);
        Locale locale = Locale.US;
        b = String.format(locale, "%s%s%s%s", strH.substring(0, 12), strH.substring(12, 16), strH.subSequence(16, 20), strK.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return b;
    }
}

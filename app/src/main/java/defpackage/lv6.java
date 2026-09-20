package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class lv6 extends mv6 {
    public lv6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.mv6
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.mv6
    public final double c(long j, Object obj) {
        return Double.longBitsToDouble(y(j, obj));
    }

    @Override // defpackage.mv6
    public final float e(long j, Object obj) {
        return Float.intBitsToFloat(w(j, obj));
    }

    @Override // defpackage.mv6
    public final void g(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.mv6
    public final void j(Object obj, long j, boolean z) {
        if (nv6.h) {
            nv6.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            nv6.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.mv6
    public final void k(Object obj, long j, byte b) {
        if (nv6.h) {
            nv6.d(obj, j, b);
        } else {
            nv6.e(obj, j, b);
        }
    }

    @Override // defpackage.mv6
    public final void m(Object obj, long j, double d) {
        G(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.mv6
    public final void p(Object obj, long j, float f) {
        F(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.mv6
    public final boolean r(long j, Object obj) {
        if (nv6.h) {
            return ((byte) ((nv6.c.w((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
        }
        return ((byte) ((nv6.c.w((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}

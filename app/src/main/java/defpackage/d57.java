package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class d57 extends mv6 {
    public d57(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.mv6
    public final double b(long j, Object obj) {
        return Double.longBitsToDouble(v(j, obj));
    }

    @Override // defpackage.mv6
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(s(j, obj));
    }

    @Override // defpackage.mv6
    public final void f(Object obj, long j, boolean z) {
        if (e57.g) {
            e57.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            e57.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.mv6
    public final void h(Object obj, long j, byte b) {
        if (e57.g) {
            e57.c(obj, j, b);
        } else {
            e57.d(obj, j, b);
        }
    }

    @Override // defpackage.mv6
    public final void i(Object obj, long j, double d) {
        D(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.mv6
    public final void l(Object obj, long j, float f) {
        B(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.mv6
    public final boolean n(long j, Object obj) {
        if (e57.g) {
            return ((byte) ((e57.c.s((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
        }
        return ((byte) ((e57.c.s((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}

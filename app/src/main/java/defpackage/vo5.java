package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class vo5 extends yh3 implements Serializable {
    public int A;
    public int B;
    public int C;
    public int D;
    public int y;
    public int z;

    public vo5(int i, int i2) {
        int i3 = ~i;
        this.y = i;
        this.z = i2;
        this.A = 0;
        this.B = 0;
        this.C = i3;
        this.D = (i << 10) ^ (i2 >>> 4);
        if (!(((((i | i2) | 0) | 0) | i3) != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i4 = 0; i4 < 64; i4++) {
            d();
        }
    }

    @Override // defpackage.yh3
    public final int a(int i) {
        return ((-i) >> 31) & (d() >>> (32 - i));
    }

    @Override // defpackage.yh3
    public final int d() {
        int i = this.y;
        int i2 = i ^ (i >>> 2);
        this.y = this.z;
        this.z = this.A;
        this.A = this.B;
        int i3 = this.C;
        this.B = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.C = i4;
        int i5 = this.D + 362437;
        this.D = i5;
        return i4 + i5;
    }
}

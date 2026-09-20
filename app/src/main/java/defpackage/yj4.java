package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yj4 extends be3<short[]> {
    public short[] a;
    public int b;

    public yj4(short[] sArr) {
        this.a = sArr;
        this.b = sArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final short[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}

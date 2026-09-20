package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ip1 extends be3<int[]> {
    public int[] a;
    public int b;

    public ip1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final int[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}

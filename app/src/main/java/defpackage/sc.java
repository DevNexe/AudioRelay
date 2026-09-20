package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class sc extends be3<boolean[]> {
    public boolean[] a;
    public int b;

    public sc(boolean[] zArr) {
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final boolean[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}

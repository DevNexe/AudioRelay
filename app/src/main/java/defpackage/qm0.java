package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class qm0 extends be3<double[]> {
    public double[] a;
    public int b;

    public qm0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final double[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}

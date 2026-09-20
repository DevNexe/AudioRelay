package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wy0 extends be3<float[]> {
    public float[] a;
    public int b;

    public wy0(float[] fArr) {
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final float[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}

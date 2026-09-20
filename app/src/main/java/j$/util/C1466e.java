package j$.util;

import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1466e implements InterfaceC1494n {
    private double a;
    private double b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final void a(C1466e c1466e) {
        this.count += c1466e.count;
        this.b += c1466e.b;
        double d = c1466e.sum - this.a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.a = d4;
        double d5 = c1466e.a - d4;
        double d6 = d3 + d5;
        this.a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, c1466e.min);
        this.max = Math.max(this.max, c1466e.max);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.count++;
        this.b += d;
        double d2 = d - this.a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C1466e.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.a;
        if (Double.isNaN(d2) && Double.isInfinite(this.b)) {
            d2 = this.b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.a;
            if (Double.isNaN(d3) && Double.isInfinite(this.b)) {
                d3 = this.b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}

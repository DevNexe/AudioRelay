package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class E2 extends AbstractC1602s2 {
    private double[] c;
    private int d;

    E2(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.AbstractC1523a2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(j);
        if (this.b) {
            while (i < this.d && !interfaceC1558h2.h()) {
                interfaceC1558h2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                interfaceC1558h2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC1558h2.end();
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }
}

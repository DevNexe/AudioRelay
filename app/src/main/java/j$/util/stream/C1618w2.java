package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1618w2 extends AbstractC1602s2 {
    private K2 c;

    C1618w2(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC1523a2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC1558h2.h()) {
                    break;
                }
                interfaceC1558h2.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                interfaceC1558h2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC1558h2.end();
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new K2((int) j) : new K2();
    }
}

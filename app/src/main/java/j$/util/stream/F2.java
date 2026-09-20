package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class F2 extends AbstractC1606t2 {
    private int[] c;
    private int d;

    F2(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.stream.InterfaceC1548f2, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.AbstractC1528b2, j$.util.stream.InterfaceC1558h2
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
        this.c = new int[(int) j];
    }
}

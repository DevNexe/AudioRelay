package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class H2 extends AbstractC1614v2 {
    private Object[] d;
    private int e;

    H2(InterfaceC1558h2 interfaceC1558h2, Comparator comparator) {
        super(interfaceC1558h2, comparator);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(j);
        if (this.c) {
            while (i < this.e && !interfaceC1558h2.h()) {
                interfaceC1558h2.p(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC1558h2.p(this.d[i]);
                i++;
            }
        }
        interfaceC1558h2.end();
        this.d = null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}

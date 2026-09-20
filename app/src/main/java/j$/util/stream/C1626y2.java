package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1626y2 extends AbstractC1610u2 {
    private O2 c;

    C1626y2(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.stream.InterfaceC1553g2, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC1533c2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC1558h2.h()) {
                    break;
                }
                interfaceC1558h2.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                interfaceC1558h2.accept(jArr[i]);
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
        this.c = j > 0 ? new O2((int) j) : new O2();
    }
}

package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1622x2 extends AbstractC1606t2 {
    private M2 c;

    C1622x2(InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
    }

    @Override // j$.util.stream.InterfaceC1548f2, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC1528b2, j$.util.stream.InterfaceC1558h2
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        interfaceC1558h2.f(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (interfaceC1558h2.h()) {
                    break;
                }
                interfaceC1558h2.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                interfaceC1558h2.accept(iArr[i]);
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
        this.c = j > 0 ? new M2((int) j) : new M2();
    }
}

package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1614v2 extends AbstractC1538d2 {
    protected final Comparator b;
    protected boolean c;

    AbstractC1614v2(InterfaceC1558h2 interfaceC1558h2, Comparator comparator) {
        super(interfaceC1558h2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final boolean h() {
        this.c = true;
        return false;
    }
}

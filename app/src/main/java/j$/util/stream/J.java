package j$.util.stream;

import j$.util.C1511j;

/* JADX INFO: loaded from: classes2.dex */
final class J extends M implements InterfaceC1548f2 {
    J() {
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        p(Integer.valueOf(i));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C1511j.d(((Integer) this.b).intValue());
        }
        return null;
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}

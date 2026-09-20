package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
abstract class Z0 implements F0 {
    Z0() {
    }

    @Override // j$.util.stream.F0
    public F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final void c(int i, Object obj) {
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.F0
    public /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.I0(this, j, j2, intFunction);
    }
}

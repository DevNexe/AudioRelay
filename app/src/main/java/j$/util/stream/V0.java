package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class V0 extends Z0 implements B0 {
    V0() {
    }

    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final E0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        return AbstractC1616w0.g;
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Double[] dArr, int i) {
        AbstractC1616w0.z0(this, dArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.C0(this, consumer);
    }

    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.F0(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final j$.util.L spliterator() {
        return j$.util.b0.b();
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.b0.b();
    }
}

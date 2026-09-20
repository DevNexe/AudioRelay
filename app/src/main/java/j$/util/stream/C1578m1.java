package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1578m1 extends O2 implements D0, InterfaceC1628z0 {
    C1578m1() {
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    @Override // j$.util.stream.O2, j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC1628z0, j$.util.stream.A0
    public final D0 build() {
        return this;
    }

    @Override // j$.util.stream.A0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void c(int i, Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void d(Object obj) {
        super.d((InterfaceC1481g0) obj);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        clear();
        u(j);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1616w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.H0(this, j, j2);
    }

    @Override // j$.util.stream.O2, j$.util.stream.Q2, java.lang.Iterable
    public final j$.util.L spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.O2, j$.util.stream.Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.O2
    /* JADX INFO: renamed from: x */
    public final j$.util.I spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Long[] lArr, int i) {
        AbstractC1616w0.B0(this, lArr, i);
    }
}

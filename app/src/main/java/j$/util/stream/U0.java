package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class U0 extends K2 implements B0, InterfaceC1620x0 {
    U0() {
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

    @Override // j$.util.stream.K2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        super.accept(d);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC1620x0, j$.util.stream.A0
    public final B0 build() {
        return this;
    }

    @Override // j$.util.stream.A0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void c(int i, Object obj) {
        super.c(i, (double[]) obj);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void d(Object obj) {
        super.d((InterfaceC1494n) obj);
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

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1616w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1543e2
    public final /* synthetic */ void p(Double d) {
        AbstractC1616w0.q0(this, d);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.F0(this, j, j2);
    }

    @Override // j$.util.stream.K2, j$.util.stream.Q2, java.lang.Iterable
    public final j$.util.L spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K2, j$.util.stream.Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K2
    /* JADX INFO: renamed from: x */
    public final j$.util.C spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Double[] dArr, int i) {
        AbstractC1616w0.z0(this, dArr, i);
    }
}

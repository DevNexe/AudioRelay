package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1537d1 extends M2 implements C0, InterfaceC1624y0 {
    C1537d1() {
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

    @Override // j$.util.stream.M2, j$.util.function.L
    public final void accept(int i) {
        super.accept(i);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        g((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC1624y0, j$.util.stream.A0
    public final C0 build() {
        return this;
    }

    @Override // j$.util.stream.A0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void c(int i, Object obj) {
        super.c(i, (int[]) obj);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void d(Object obj) {
        super.d((j$.util.function.L) obj);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        clear();
        u(j);
    }

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        AbstractC1616w0.s0(this, num);
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

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.G0(this, j, j2);
    }

    @Override // j$.util.stream.M2, j$.util.stream.Q2, java.lang.Iterable
    public final j$.util.L spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.M2, j$.util.stream.Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.M2
    /* JADX INFO: renamed from: x */
    public final j$.util.F spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Integer[] numArr, int i) {
        AbstractC1616w0.A0(this, numArr, i);
    }
}

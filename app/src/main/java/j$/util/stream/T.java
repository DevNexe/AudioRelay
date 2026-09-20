package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class T implements E3, F3 {
    private final boolean a;

    protected T(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        if (this.a) {
            return 0;
        }
        return V2.r;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void f(long j) {
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        abstractC1616w0.w1(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.E3
    public final Object y(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        (this.a ? new U(abstractC1616w0, spliterator, this) : new V(abstractC1616w0, spliterator, abstractC1616w0.x1(this))).invoke();
        return null;
    }
}

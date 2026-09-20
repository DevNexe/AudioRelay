package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class M implements F3 {
    boolean a;
    Object b;

    M() {
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
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

    @Override // j$.util.stream.InterfaceC1558h2
    public final boolean h() {
        return this.a;
    }
}

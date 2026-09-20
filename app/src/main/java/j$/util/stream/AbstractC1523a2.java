package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1523a2 implements InterfaceC1543e2 {
    protected final InterfaceC1558h2 a;

    public AbstractC1523a2(InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        this.a = interfaceC1558h2;
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

    @Override // j$.util.stream.InterfaceC1558h2
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public boolean h() {
        return this.a.h();
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.InterfaceC1543e2
    public final /* synthetic */ void p(Double d) {
        AbstractC1616w0.q0(this, d);
    }
}

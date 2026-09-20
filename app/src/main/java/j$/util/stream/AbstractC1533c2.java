package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1533c2 implements InterfaceC1553g2 {
    protected final InterfaceC1558h2 a;

    public AbstractC1533c2(InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        this.a = interfaceC1558h2;
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

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
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

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }
}

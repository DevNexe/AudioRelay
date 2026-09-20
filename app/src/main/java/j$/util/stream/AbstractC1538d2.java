package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1538d2 implements InterfaceC1558h2 {
    protected final InterfaceC1558h2 a;

    public AbstractC1538d2(InterfaceC1558h2 interfaceC1558h2) {
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

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
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
}

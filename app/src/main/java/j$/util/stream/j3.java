package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j3 implements InterfaceC1553g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1481g0 b;

    public /* synthetic */ j3(InterfaceC1481g0 interfaceC1481g0, int i) {
        this.a = i;
        this.b = interfaceC1481g0;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.p0();
                throw null;
            default:
                AbstractC1616w0.p0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.w0();
                throw null;
            default:
                AbstractC1616w0.w0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1553g2, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        int i = this.a;
        InterfaceC1481g0 interfaceC1481g0 = this.b;
        switch (i) {
            case 0:
                ((O2) interfaceC1481g0).accept(j);
                break;
            default:
                interfaceC1481g0.accept(j);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void f(long j) {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        switch (this.a) {
            case 0:
                interfaceC1481g0.getClass();
                break;
            default:
                interfaceC1481g0.getClass();
                break;
        }
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.u0(this, l);
                break;
            default:
                AbstractC1616w0.u0(this, l);
                break;
        }
    }
}

package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1549f3 implements InterfaceC1543e2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1494n b;

    public /* synthetic */ C1549f3(InterfaceC1494n interfaceC1494n, int i) {
        this.a = i;
        this.b = interfaceC1494n;
    }

    @Override // j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        int i = this.a;
        InterfaceC1494n interfaceC1494n = this.b;
        switch (i) {
            case 0:
                ((K2) interfaceC1494n).accept(d);
                break;
            default:
                interfaceC1494n.accept(d);
                break;
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

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.x0();
                throw null;
            default:
                AbstractC1616w0.x0();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                p((Double) obj);
                break;
            default:
                p((Double) obj);
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

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        switch (this.a) {
            case 0:
                interfaceC1494n.getClass();
                break;
            default:
                interfaceC1494n.getClass();
                break;
        }
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.InterfaceC1543e2
    public final /* synthetic */ void p(Double d) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.q0(this, d);
                break;
            default:
                AbstractC1616w0.q0(this, d);
                break;
        }
    }
}

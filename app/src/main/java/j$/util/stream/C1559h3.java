package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1559h3 implements InterfaceC1548f2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j$.util.function.L b;

    public /* synthetic */ C1559h3(j$.util.function.L l, int i) {
        this.a = i;
        this.b = l;
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

    @Override // j$.util.stream.InterfaceC1548f2, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        int i2 = this.a;
        j$.util.function.L l = this.b;
        switch (i2) {
            case 0:
                ((M2) l).accept(i);
                break;
            default:
                l.accept(i);
                break;
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
                g((Integer) obj);
                break;
            default:
                g((Integer) obj);
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

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC1616w0.s0(this, num);
                break;
            default:
                AbstractC1616w0.s0(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        switch (this.a) {
            case 0:
                l.getClass();
                break;
            default:
                l.getClass();
                break;
        }
        return new j$.util.function.I(this, l);
    }
}

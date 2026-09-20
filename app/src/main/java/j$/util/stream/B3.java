package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B3 implements InterfaceC1558h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ B3(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
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
    public final void p(Object obj) {
        int i = this.a;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                ((R2) consumer).p(obj);
                break;
            default:
                consumer.p(obj);
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
}

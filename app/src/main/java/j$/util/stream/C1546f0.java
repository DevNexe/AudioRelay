package j$.util.stream;

import j$.util.C1508g;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1487j0;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1546f0 implements InterfaceC1473c0, InterfaceC1487j0, j$.util.function.F0, BiConsumer, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C1546f0(int i) {
        this.a = i;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
    }

    @Override // j$.util.function.F0
    public final void accept(Object obj, long j) {
        ((C1508g) obj).accept(j);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C1508g) obj).a((C1508g) obj2);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1487j0
    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // j$.util.function.InterfaceC1473c0
    public final long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 0:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new j$.util.concurrent.u(1, this, biConsumer);
    }
}

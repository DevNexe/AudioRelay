package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1534c3 extends AbstractC1539d3 implements Consumer {
    final Object[] b = new Object[128];

    C1534c3() {
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

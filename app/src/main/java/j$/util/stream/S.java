package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class S extends T {
    final Consumer b;

    S(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.b.p(obj);
    }
}

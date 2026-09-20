package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface F extends L {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void c(j$.util.function.L l);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    boolean j(j$.util.function.L l);

    @Override // j$.util.L, j$.util.Spliterator
    F trySplit();
}

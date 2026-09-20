package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
public interface I extends L {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void b(InterfaceC1481g0 interfaceC1481g0);

    boolean e(InterfaceC1481g0 interfaceC1481g0);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    @Override // j$.util.L, j$.util.Spliterator
    I trySplit();
}

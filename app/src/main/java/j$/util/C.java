package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
public interface C extends L {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void d(InterfaceC1494n interfaceC1494n);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    boolean o(InterfaceC1494n interfaceC1494n);

    @Override // j$.util.L, j$.util.Spliterator
    C trySplit();
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1560i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC1560i onClose(Runnable runnable);

    InterfaceC1560i parallel();

    InterfaceC1560i sequential();

    Spliterator spliterator();

    InterfaceC1560i unordered();
}

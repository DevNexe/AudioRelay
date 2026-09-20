package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1635x extends InterfaceC1636y {
    void b(InterfaceC1481g0 interfaceC1481g0);

    void forEachRemaining(Consumer consumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Long next();

    long nextLong();
}

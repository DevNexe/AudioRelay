package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1631t extends InterfaceC1636y {
    void c(j$.util.function.L l);

    void forEachRemaining(Consumer consumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Integer next();

    int nextInt();
}

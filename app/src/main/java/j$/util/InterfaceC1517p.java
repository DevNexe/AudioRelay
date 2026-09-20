package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1517p extends InterfaceC1636y {
    void d(InterfaceC1494n interfaceC1494n);

    void forEachRemaining(Consumer consumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Double next();

    double nextDouble();
}

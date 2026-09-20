package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
interface F0 {
    F0 a(int i);

    long count();

    void e(Object[] objArr, int i);

    void forEach(Consumer consumer);

    int j();

    Object[] o(IntFunction intFunction);

    F0 q(long j, long j2, IntFunction intFunction);

    Spliterator spliterator();
}

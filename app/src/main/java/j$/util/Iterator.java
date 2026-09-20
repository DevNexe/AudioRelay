package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Iterator<E> {

    /* JADX INFO: renamed from: j$.util.Iterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            consumer.getClass();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();
}

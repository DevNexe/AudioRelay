package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
final class L extends M {
    L() {
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}

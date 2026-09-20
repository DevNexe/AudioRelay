package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum yr0 implements kh3<Object> {
    INSTANCE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER;

    public static void c(Throwable th, gb2<?> gb2Var) {
        gb2Var.c(INSTANCE);
        gb2Var.onError(th);
    }

    @Override // defpackage.vl0
    public final void a() {
    }

    @Override // defpackage.uk4
    public final void clear() {
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this == INSTANCE;
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.nh3
    public final int l(int i) {
        return i & 2;
    }

    @Override // defpackage.uk4
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.uk4
    public final Object poll() {
        return null;
    }
}

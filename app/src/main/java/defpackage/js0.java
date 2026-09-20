package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum js0 implements oh3<Object> {
    INSTANCE;

    @Override // defpackage.mw4
    public final void a(long j) {
        qw4.l(j);
    }

    @Override // defpackage.mw4
    public final void cancel() {
    }

    @Override // defpackage.uk4
    public final void clear() {
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}

package j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1464b extends q {
    final ConcurrentHashMap i;
    m j;

    AbstractC1464b(m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        f();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        m mVar = this.j;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.i(mVar.b, null, null);
    }
}

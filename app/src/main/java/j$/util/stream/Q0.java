package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
abstract class Q0 extends H0 implements E0 {
    Q0(E0 e0, E0 e1) {
        super(e0, e1);
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        c(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.E0
    public final void c(int i, Object obj) {
        F0 f0 = this.a;
        ((E0) f0).c(i, obj);
        ((E0) this.b).c(i + ((int) ((E0) f0).count()), obj);
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        ((E0) this.a).d(obj);
        ((E0) this.b).d(obj);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1616w0.y0(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}

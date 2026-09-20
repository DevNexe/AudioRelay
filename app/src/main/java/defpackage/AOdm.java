package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class AOdm<T, V extends z_Mm> implements is4<T> {
    public long A;
    public boolean B;
    public final pb5<T, V> w;
    public final kz2 x;
    public V y;
    public long z;

    public /* synthetic */ AOdm(pb5 pb5Var, Object obj, z_Mm z_mm, int i) {
        this(pb5Var, obj, (i & 4) != 0 ? null : z_mm, (i & 8) != 0 ? Long.MIN_VALUE : 0L, (i & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    @Override // defpackage.is4
    public final T getValue() {
        return this.x.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.w.b().invoke(this.y) + ", isRunning=" + this.B + ", lastFrameTimeNanos=" + this.z + ", finishedTimeNanos=" + this.A + ')';
    }

    public AOdm(pb5<T, V> pb5Var, T t, V v, long j, long j2, boolean z) {
        this.w = pb5Var;
        this.x = ps0.R(t);
        this.y = v != null ? (V) X.o(v) : (V) pb5Var.a().invoke(t).c();
        this.z = j;
        this.A = j2;
        this.B = z;
    }
}

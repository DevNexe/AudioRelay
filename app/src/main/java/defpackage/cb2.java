package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cb2<T> extends xa2<T> {
    public final Throwable w;

    public cb2(Throwable th) {
        this.w = th;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        gb2Var.c(yr0.INSTANCE);
        gb2Var.onError(this.w);
    }
}

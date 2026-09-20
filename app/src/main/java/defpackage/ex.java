package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ex extends qw {
    public final Throwable w;

    public ex(Throwable th) {
        this.w = th;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        nxVar.c(yr0.INSTANCE);
        nxVar.onError(this.w);
    }
}

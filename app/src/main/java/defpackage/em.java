package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class em implements Runnable {
    public final /* synthetic */ kK w;
    public final /* synthetic */ int x;

    public em(kK kKVar, int i) {
        this.w = kKVar;
        this.x = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp3.NUlFixed nUl = ((ac5.QnHx) this.w).A;
        if (nUl != null) {
            nUl.c(this.x);
        }
    }
}

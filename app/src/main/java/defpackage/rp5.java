package defpackage;

import com.google.android.gms.common.api.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class rp5 implements Runnable {
    public final /* synthetic */ sp5 w;

    public rp5(sp5 sp5Var) {
        this.w = sp5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QnHx.NUlFixed nUl = this.w.a.x;
        nUl.disconnect(nUl.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

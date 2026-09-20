package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements Runnable {
    public final /* synthetic */ kK w;
    public final /* synthetic */ Typeface x;

    public cm(kK kKVar, Typeface typeface) {
        this.w = kKVar;
        this.x = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp3.NUlFixed nUl = ((ac5.QnHx) this.w).A;
        if (nUl != null) {
            nUl.d(this.x);
        }
    }
}

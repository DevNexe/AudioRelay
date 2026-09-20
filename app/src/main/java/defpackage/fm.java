package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class fm {
    public final kK a;
    public final Handler b;

    public fm(ac5.QnHx qnHx, Handler handler) {
        this.a = qnHx;
        this.b = handler;
    }

    public final void a(t41.QnHx qnHx) {
        int i = qnHx.b;
        boolean z = i == 0;
        Handler handler = this.b;
        kK kKVar = this.a;
        if (z) {
            handler.post(new cm(kKVar, qnHx.a));
        } else {
            handler.post(new em(kKVar, i));
        }
    }
}

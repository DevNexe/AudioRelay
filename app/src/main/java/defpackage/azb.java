package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class azb implements Runnable {
    public final /* synthetic */ Application w;
    public final /* synthetic */ HR47.QnHx x;

    public azb(Application application, HR47.QnHx qnHx) {
        this.w = application;
        this.x = qnHx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.unregisterActivityLifecycleCallbacks(this.x);
    }
}

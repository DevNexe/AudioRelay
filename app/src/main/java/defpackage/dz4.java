package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class dz4 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Notification x;
    public final /* synthetic */ SystemForegroundService y;

    public dz4(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.y = systemForegroundService;
        this.w = i;
        this.x = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.y.A.notify(this.w, this.x);
    }
}

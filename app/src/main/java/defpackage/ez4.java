package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class ez4 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ SystemForegroundService x;

    public ez4(SystemForegroundService systemForegroundService, int i) {
        this.x = systemForegroundService;
        this.w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.A.cancel(this.w);
    }
}

package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class cz4 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Notification x;
    public final /* synthetic */ int y;
    public final /* synthetic */ SystemForegroundService z;

    public cz4(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.z = systemForegroundService;
        this.w = i;
        this.x = notification;
        this.y = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.x;
        int i2 = this.w;
        SystemForegroundService systemForegroundService = this.z;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.y);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}

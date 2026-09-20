package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.bz4;
import defpackage.f32;
import defpackage.nm;
import defpackage.nn5;
import defpackage.oe3;
import defpackage.on5;
import defpackage.s52;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends f32 implements QnHx.InterfaceC0035QnHx {
    public static final String B = s52.e("SystemFgService");
    public NotificationManager A;
    public Handler x;
    public boolean y;
    public QnHx z;

    public final void a() {
        this.x = new Handler(Looper.getMainLooper());
        this.A = (NotificationManager) getApplicationContext().getSystemService("notification");
        QnHx qnHx = new QnHx(getApplicationContext());
        this.z = qnHx;
        if (qnHx.E == null) {
            qnHx.E = this;
        } else {
            s52.c().b(QnHx.F, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.f32, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.f32, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        QnHx qnHx = this.z;
        qnHx.E = null;
        synchronized (qnHx.y) {
            qnHx.D.c();
        }
        oe3 oe3Var = qnHx.w.B;
        synchronized (oe3Var.G) {
            oe3Var.F.remove(qnHx);
        }
    }

    @Override // defpackage.f32, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.y;
        String str = B;
        if (z) {
            s52.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            QnHx qnHx = this.z;
            qnHx.E = null;
            synchronized (qnHx.y) {
                qnHx.D.c();
            }
            oe3 oe3Var = qnHx.w.B;
            synchronized (oe3Var.G) {
                oe3Var.F.remove(qnHx);
            }
            a();
            this.y = false;
        }
        if (intent == null) {
            return 3;
        }
        QnHx qnHx2 = this.z;
        qnHx2.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = QnHx.F;
        nn5 nn5Var = qnHx2.w;
        if (zEquals) {
            s52.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            ((on5) qnHx2.x).a(new bz4(qnHx2, nn5Var.y, intent.getStringExtra("KEY_WORKSPEC_ID")));
            qnHx2.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            qnHx2.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            s52.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            nn5Var.getClass();
            ((on5) nn5Var.z).a(new nm(nn5Var, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        s52.c().d(str2, "Stopping foreground service", new Throwable[0]);
        QnHx.InterfaceC0035QnHx interfaceC0035QnHx = qnHx2.E;
        if (interfaceC0035QnHx == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0035QnHx;
        systemForegroundService.y = true;
        s52.c().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}

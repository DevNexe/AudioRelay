package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.f32;
import defpackage.il5;
import defpackage.s52;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends f32 implements LPt8Fixed.F1 {
    public static final String z = s52.e("SystemAlarmService");
    public LPt8Fixed x;
    public boolean y;

    public final void a() {
        LPt8Fixed lPt8 = new LPt8Fixed(this);
        this.x = lPt8;
        if (lPt8.F == null) {
            lPt8.F = this;
        } else {
            s52.c().b(LPt8Fixed.G, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
    }

    public final void b() {
        this.y = true;
        s52.c().a(z, "All commands completed in dispatcher", new Throwable[0]);
        String str = il5.a;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = il5.b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                s52.c().f(il5.a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.f32, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        this.y = false;
    }

    @Override // defpackage.f32, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.y = true;
        this.x.d();
    }

    @Override // defpackage.f32, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.y) {
            s52.c().d(z, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.x.d();
            a();
            this.y = false;
        }
        if (intent == null) {
            return 3;
        }
        this.x.a(intent, i2);
        return 3;
    }
}

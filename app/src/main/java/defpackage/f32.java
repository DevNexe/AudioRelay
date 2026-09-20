package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.RBi;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
public class f32 extends Service implements d32 {
    public final RBi w = new RBi(this);

    @Override // defpackage.d32
    public final YKK c() {
        return this.w.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.w.a(YKK.CQf.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.w.a(YKK.CQf.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        YKK.CQf cQf = YKK.CQf.ON_STOP;
        RBi rBi = this.w;
        rBi.a(cQf);
        rBi.a(YKK.CQf.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.w.a(YKK.CQf.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}

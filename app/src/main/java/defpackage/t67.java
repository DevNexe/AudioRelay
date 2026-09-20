package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t67 implements ServiceConnection, pa7 {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final i57 e;
    public ComponentName f;
    public final /* synthetic */ ca7 g;

    public t67(ca7 ca7Var, i57 i57Var) {
        this.g = ca7Var;
        this.e = i57Var;
    }

    public final void a(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            ca7 ca7Var = this.g;
            e60 e60Var = ca7Var.g;
            Context context = ca7Var.e;
            boolean zD = e60Var.d(context, str, this.e.a(context), this, this.e.c, executor);
            this.c = zD;
            if (zD) {
                this.g.f.sendMessageDelayed(this.g.f.obtainMessage(1, this.e), this.g.i);
            } else {
                this.b = 2;
                try {
                    ca7 ca7Var2 = this.g;
                    ca7Var2.g.c(ca7Var2.e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}

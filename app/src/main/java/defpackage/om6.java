package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfrg;

/* JADX INFO: loaded from: classes3.dex */
public final class om6 implements ServiceConnection {
    public final /* synthetic */ zzfrg a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfrg zzfrgVar = this.a;
        zzfrgVar.b.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzfrgVar.zzc().post(new mm6(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfrg zzfrgVar = this.a;
        zzfrgVar.b.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzfrgVar.zzc().post(new nm6(this));
    }
}

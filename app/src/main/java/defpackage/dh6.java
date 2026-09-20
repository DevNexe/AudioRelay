package defpackage;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class dh6 extends TimerTask {
    public final /* synthetic */ AlertDialog w;
    public final /* synthetic */ Timer x;
    public final /* synthetic */ zzl y;

    public dh6(AlertDialog alertDialog, Timer timer, zzl zzlVar) {
        this.w = alertDialog;
        this.x = timer;
        this.y = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.w.dismiss();
        this.x.cancel();
        zzl zzlVar = this.y;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}

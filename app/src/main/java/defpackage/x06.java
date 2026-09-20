package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class x06 implements Runnable {
    public final /* synthetic */ Context w;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public x06(Context context, String str, boolean z, boolean z2) {
        this.w = context;
        this.x = str;
        this.y = z;
        this.z = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzq();
        AlertDialog.Builder builderZzG = zzs.zzG(this.w);
        builderZzG.setMessage(this.x);
        if (this.y) {
            builderZzG.setTitle("Error");
        } else {
            builderZzG.setTitle("Info");
        }
        if (this.z) {
            builderZzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzG.setPositiveButton("Learn More", new p06(this));
            builderZzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzG.create().show();
    }
}

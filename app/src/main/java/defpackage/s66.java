package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zzbxs;

/* JADX INFO: loaded from: classes3.dex */
public final class s66 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbxs w;

    public s66(zzbxs zzbxsVar) {
        this.w = zzbxsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w.zzg("Operation denied by user.");
    }
}

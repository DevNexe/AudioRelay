package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zzbxx;

/* JADX INFO: loaded from: classes3.dex */
public final class v66 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbxx w;

    public v66(zzbxx zzbxxVar) {
        this.w = zzbxxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w.zzg("User canceled the download.");
    }
}

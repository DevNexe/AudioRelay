package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class p06 implements DialogInterface.OnClickListener {
    public final /* synthetic */ x06 w;

    public p06(x06 x06Var) {
        this.w = x06Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.zzq();
        zzs.zzQ(this.w.w, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.LPt8Fixed;
import com.google.android.gms.internal.ads.zzfqd;
import com.google.android.gms.internal.ads.zzfqn;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
@TargetApi(18)
public final class im6 {
    public static final zzfqv c = new zzfqv("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final zzfrg a;
    public final String b;

    public im6(Context context) {
        if (zzfrj.zza(context)) {
            this.a = new zzfrg(context.getApplicationContext(), c, "OverlayDisplayService", d, zzfqd.zza, null, null);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public final void a(zzfqp zzfqpVar, zzfqn zzfqnVar, int i) {
        zzfrg zzfrgVar = this.a;
        if (zzfrgVar == null) {
            c.zzb("error: %s", "Play Store not found.");
        } else {
            z05 z05Var = new z05();
            zzfrgVar.zzp(new LPt8Fixed(this, z05Var, zzfqpVar, i, zzfqnVar, z05Var), z05Var);
        }
    }
}

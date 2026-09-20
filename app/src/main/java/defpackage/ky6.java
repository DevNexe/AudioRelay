package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;
import com.google.android.gms.internal.ads.zzmv;
import com.google.android.gms.internal.ads.zzmz;

/* JADX INFO: loaded from: classes3.dex */
public final class ky6 {
    public static zzmz a(Context context, cz6 cz6Var, boolean z) {
        zzmv zzmvVarZzb = zzmv.zzb(context);
        if (zzmvVarZzb == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzmz(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            cz6Var.getClass();
            cz6Var.o.zzw(zzmvVarZzb);
        }
        return new zzmz(zzmvVarZzb.zza());
    }
}

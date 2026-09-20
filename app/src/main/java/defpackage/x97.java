package defpackage;

import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzqh;

/* JADX INFO: loaded from: classes3.dex */
public final class x97 {
    public static void a(zzqh zzqhVar, zzmz zzmzVar) {
        LogSessionId logSessionIdZza = zzmzVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqhVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}

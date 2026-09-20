package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import com.google.android.gms.internal.ads.zzmz;

/* JADX INFO: loaded from: classes3.dex */
public final class d77 {
    public static void a(AudioTrack audioTrack, zzmz zzmzVar) {
        LogSessionId logSessionIdZza = zzmzVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdZza);
    }
}

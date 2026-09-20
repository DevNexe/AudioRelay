package defpackage;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzaua;

/* JADX INFO: loaded from: classes3.dex */
public final class j06 extends Thread {
    public final /* synthetic */ AudioTrack w;
    public final /* synthetic */ zzaua x;

    public j06(zzaua zzauaVar, AudioTrack audioTrack) {
        this.x = zzauaVar;
        this.w = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        zzaua zzauaVar = this.x;
        AudioTrack audioTrack = this.w;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            zzauaVar.e.open();
        }
    }
}

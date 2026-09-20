package defpackage;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzos;

/* JADX INFO: loaded from: classes3.dex */
public final class b77 extends Thread {
    public final /* synthetic */ AudioTrack w;
    public final /* synthetic */ zzos x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b77(zzos zzosVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.x = zzosVar;
        this.w = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        zzos zzosVar = this.x;
        AudioTrack audioTrack = this.w;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            zzosVar.f.open();
        }
    }
}

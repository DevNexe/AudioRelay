package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzos;

/* JADX INFO: loaded from: classes3.dex */
public final class t77 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ v77 a;

    public t77(v77 v77Var) {
        this.a = v77Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzdd.zzf(audioTrack == this.a.c.p);
        zzos zzosVar = this.a.c;
        zznt zzntVar = zzosVar.m;
        if (zzntVar == null || !zzosVar.M) {
            return;
        }
        zzntVar.zzb();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzdd.zzf(audioTrack == this.a.c.p);
        zzos zzosVar = this.a.c;
        zznt zzntVar = zzosVar.m;
        if (zzntVar == null || !zzosVar.M) {
            return;
        }
        zzntVar.zzb();
    }
}

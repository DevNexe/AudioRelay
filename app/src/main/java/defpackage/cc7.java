package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzvo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class cc7 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public bc7 d;

    public cc7(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static cc7 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new cc7(audioManager.getSpatializer());
    }

    public final void b(zzvo zzvoVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new bc7(zzvoVar);
            final Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzvf
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.d);
        }
    }

    public final void c() {
        bc7 bc7Var = this.d;
        if (bc7Var == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(bc7Var);
        Handler handler = this.c;
        int i = zzel.zza;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(zzk zzkVar, zzaf zzafVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzel.zzj(("audio/eac3-joc".equals(zzafVar.zzm) && zzafVar.zzz == 16) ? 12 : zzafVar.zzz));
        int i = zzafVar.zzA;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(zzkVar.zza().zza, channelMask.build());
    }

    public final boolean e() {
        return this.a.isAvailable();
    }

    public final boolean f() {
        return this.a.isEnabled();
    }
}

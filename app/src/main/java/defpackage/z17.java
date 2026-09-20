package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzkf;
import com.google.android.gms.internal.ads.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class z17 {
    public final Context a;
    public final Handler b;
    public final zzkf c;
    public final AudioManager d;
    public x17 e;
    public int f;
    public int g;
    public boolean h;

    public z17(Context context, Handler handler, uy6 uy6Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = uy6Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzdd.zzb(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        int i = this.f;
        this.h = zzel.zza >= 23 ? audioManager.isStreamMute(i) : b(audioManager, i) == 0;
        x17 x17Var = new x17(this);
        try {
            zzel.zzA(applicationContext, x17Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = x17Var;
        } catch (RuntimeException e) {
            zzdu.zzb("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdu.zzb("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void a() {
        if (this.f == 3) {
            return;
        }
        this.f = 3;
        c();
        uy6 uy6Var = (uy6) this.c;
        final zzt zztVarE = cz6.e(uy6Var.w.t);
        cz6 cz6Var = uy6Var.w;
        if (zztVarE.equals(cz6Var.L)) {
            return;
        }
        cz6Var.L = zztVarE;
        zzdq zzdqVar = new zzdq() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzcd) obj).zzb(zztVarE);
            }
        };
        zzdt zzdtVar = cz6Var.j;
        zzdtVar.zzd(29, zzdqVar);
        zzdtVar.zzc();
    }

    public final void c() {
        final boolean zIsStreamMute;
        int i = this.f;
        AudioManager audioManager = this.d;
        final int iB = b(audioManager, i);
        int i2 = this.f;
        if (zzel.zza >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i2);
        } else {
            zIsStreamMute = b(audioManager, i2) == 0;
        }
        if (this.g == iB && this.h == zIsStreamMute) {
            return;
        }
        this.g = iB;
        this.h = zIsStreamMute;
        zzdt zzdtVar = ((uy6) this.c).w.j;
        zzdtVar.zzd(30, new zzdq() { // from class: com.google.android.gms.internal.ads.zzii
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzcd) obj).zzc(iB, zIsStreamMute);
            }
        });
        zzdtVar.zzc();
    }
}

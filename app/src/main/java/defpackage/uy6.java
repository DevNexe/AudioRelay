package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzgj;
import com.google.android.gms.internal.ads.zzgn;
import com.google.android.gms.internal.ads.zzgq;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzgz;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzkf;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzug;
import com.google.android.gms.internal.ads.zzya;

/* JADX INFO: loaded from: classes3.dex */
public final class uy6 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzya, zznq, zzug, zzrg, zzgn, zzgj, zzkf, zzgz {
    public final /* synthetic */ cz6 w;

    public /* synthetic */ uy6(cz6 cz6Var) {
        this.w = cz6Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3 = cz6.S;
        Surface surface = new Surface(surfaceTexture);
        cz6 cz6Var = this.w;
        cz6Var.j(surface);
        cz6Var.D = surface;
        cz6Var.h(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.j(null);
        cz6Var.h(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3 = cz6.S;
        this.w.h(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = cz6.S;
        this.w.h(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = cz6.S;
        this.w.h(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final /* synthetic */ void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzb(boolean z) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        int iZzh = cz6Var.zzh();
        if (iZzh == 2 || iZzh == 3) {
            cz6Var.n();
            boolean z2 = cz6Var.N.p;
            cz6Var.zzq();
            cz6Var.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzc(Exception exc) {
        this.w.o.zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzd(String str, long j, long j2) {
        this.w.o.zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zze(String str) {
        this.w.o.zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzf(zzgq zzgqVar) {
        cz6 cz6Var = this.w;
        cz6Var.o.zzB(zzgqVar);
        cz6Var.getClass();
        cz6Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzg(zzgq zzgqVar) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.getClass();
        cz6Var.o.zzC(zzgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzh(zzaf zzafVar, zzgr zzgrVar) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.getClass();
        cz6Var.o.zzD(zzafVar, zzgrVar);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzi(long j) {
        this.w.o.zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzj(Exception exc) {
        this.w.o.zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzk(int i, long j, long j2) {
        this.w.o.zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzl(int i, long j) {
        this.w.o.zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzm(Object obj, long j) {
        cz6 cz6Var = this.w;
        cz6Var.o.zzI(obj, j);
        if (cz6Var.C == obj) {
            zzih zzihVar = new zzdq() { // from class: com.google.android.gms.internal.ads.zzih
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj2) {
                }
            };
            zzdt zzdtVar = cz6Var.j;
            zzdtVar.zzd(26, zzihVar);
            zzdtVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzn(final boolean z) {
        cz6 cz6Var = this.w;
        if (cz6Var.I == z) {
            return;
        }
        cz6Var.I = z;
        zzdt zzdtVar = cz6Var.j;
        zzdtVar.zzd(23, new zzdq() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzcd) obj).zzq(z);
            }
        });
        zzdtVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzo(Exception exc) {
        this.w.o.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzp(String str, long j, long j2) {
        this.w.o.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzq(String str) {
        this.w.o.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzr(zzgq zzgqVar) {
        cz6 cz6Var = this.w;
        cz6Var.o.zzM(zzgqVar);
        cz6Var.getClass();
        cz6Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzs(zzgq zzgqVar) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.getClass();
        cz6Var.o.zzN(zzgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzt(long j, int i) {
        this.w.o.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzu(zzaf zzafVar, zzgr zzgrVar) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.getClass();
        cz6Var.o.zzP(zzafVar, zzgrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzv(final zzda zzdaVar) {
        int i = cz6.S;
        cz6 cz6Var = this.w;
        cz6Var.getClass();
        zzdt zzdtVar = cz6Var.j;
        zzdtVar.zzd(25, new zzdq() { // from class: com.google.android.gms.internal.ads.zzil
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzcd) obj).zzu(zzdaVar);
            }
        });
        zzdtVar.zzc();
    }
}

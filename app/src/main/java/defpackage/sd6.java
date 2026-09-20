package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.internal.ads.zzakv;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcwt;
import com.google.android.gms.internal.ads.zzcwu;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzdby;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzeie;
import com.google.android.gms.internal.ads.zzemv;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzeyw;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyx;
import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class sd6 implements zzfyk, zzakv, zzfoa, zzchj, InitializationCompleteCallback, zzeod {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ sd6(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            ((zzbrp) this.x).zze(str);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            ((zzbrp) this.x).zzf();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final File zza() {
        return (File) this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
            case 4:
                break;
            case 7:
                zzcdj.l.remove((zzfyx) obj);
                break;
            case 8:
                break;
            default:
                zzeie zzeieVar = (zzeie) obj;
                zze zzeVarZza = zzeieVar.a.zzd().zza(th);
                zzeieVar.d.zza(zzeVarZza);
                zzfeh.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* synthetic */ void mo32zzb(Object obj) {
        switch (this.w) {
            case 0:
                ((zzdby) this.x).w.zza();
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            default:
                zzdua zzduaVar = (zzdua) obj;
                synchronized (((zzfcp) this.x)) {
                    ((zzfcp) this.x).z = zzduaVar;
                    if (((Boolean) zzay.zzc().zzb(zzbiy.zzcG)).booleanValue()) {
                        zzduaVar.zzd().zza = ((zzfcp) this.x).y;
                    }
                    ((zzfcp) this.x).z.zzW();
                    break;
                }
                return;
            case 4:
                zzcmn zzcmnVar = (zzcmn) this.x;
                new zzby(zzcmnVar.getContext(), zzcmnVar.zzp().zza, (String) obj).zzb();
                return;
            case 7:
                zzcdj.l.remove((zzfyx) this.x);
                return;
            case 8:
                ((zzecr) this.x).c.zzb((zzfde) obj);
                return;
            case 9:
                ((zzcxa) obj).zzW();
                return;
            case 10:
                zzcxa zzcxaVar = (zzcxa) obj;
                synchronized (((zzemv) this.x)) {
                    zzcxa zzcxaVar2 = ((zzemv) this.x).D;
                    if (zzcxaVar2 != null) {
                        zzcxaVar2.zzV();
                    }
                    Object obj2 = this.x;
                    ((zzemv) obj2).D = zzcxaVar;
                    ((zzemv) obj2).D.zzW();
                    break;
                }
                return;
            case 11:
                zzcwt zzcwtVar = (zzcwt) obj;
                synchronized (((zzeyw) this.x)) {
                    zzcwt zzcwtVar2 = ((zzeyw) this.x).F;
                    if (zzcwtVar2 != null) {
                        zzcwtVar2.zzV();
                    }
                    zzeyw zzeywVar = (zzeyw) this.x;
                    zzeywVar.F = zzcwtVar;
                    zzcwtVar.zzc(zzeywVar);
                    zzeyw zzeywVar2 = (zzeyw) this.x;
                    zzeywVar2.B.zzl(new zzcwu(zzcwtVar, zzeywVar2, zzeywVar2.B));
                    zzcwtVar.zzW();
                    break;
                }
                return;
        }
    }

    public /* synthetic */ sd6(zzavn zzavnVar) {
        this.w = 3;
        this.x = zzavnVar;
    }

    public /* synthetic */ sd6(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzeod, defpackage.zc7
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo45zza() {
        switch (this.w) {
            case 10:
                synchronized (((zzemv) this.x)) {
                    ((zzemv) this.x).D = null;
                    break;
                }
                return;
            case 11:
                synchronized (((zzeyw) this.x)) {
                    ((zzeyw) this.x).F = null;
                    break;
                }
                return;
            default:
                synchronized (((zzfcp) this.x)) {
                    ((zzfcp) this.x).z = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        ((zzbtl) this.x).zzh(((zzbsm) obj).zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final boolean zza(File file) {
        try {
            return ((zzfma) this.x).zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

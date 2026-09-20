package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzdoj;
import com.google.android.gms.internal.ads.zzdss;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzebv;
import com.google.android.gms.internal.ads.zzenz;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfdw;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfyk;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pd6 implements zzfyk, zzfni, zzchh, SignalCallbacks, zzbln, zzbyb, zzf, zzeod {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ pd6(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            ((zzbxb) this.x).zzg(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            ((zzbxb) this.x).zze(str);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: zza */
    public final JSONObject mo46zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo43zza() {
        switch (this.w) {
            case 2:
                ((zzbtl) this.x).d.b();
                return;
            case 11:
                synchronized (((zzenz) this.x)) {
                    break;
                }
                return;
            default:
                synchronized (((zzfcj) this.x)) {
                    ((zzfcj) this.x).C = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyb, com.google.android.gms.ads.internal.zzf
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public final void mo44zzb() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 7:
                ((zzduv) obj).c.zza();
                break;
            default:
                ((zzdlf) obj).zzb().onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbyb, com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 6:
                zzdoj zzdojVar = ((zzdss) obj).z;
                if (zzdojVar != null) {
                    zzdojVar.zzy("_videoMediaView");
                }
                break;
            case 7:
                ((zzduv) obj).m.zza();
                break;
            default:
                zzdlf zzdlfVar = (zzdlf) obj;
                zzdlfVar.zzc().zza();
                zzdlfVar.zzf().zza();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zzd(MotionEvent motionEvent) {
    }

    public /* synthetic */ pd6(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            ((zzbxb) this.x).zzf(str);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfni
    public final void zzb(int i, long j, String str) {
        ((zzfmf) this.x).zze(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        switch (this.w) {
            case 0:
                ((zzdaf) this.x).f.zzh(true);
                return;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 10:
            default:
                ((zzfir) this.x).zzf();
                return;
            case 4:
                return;
            case 5:
                String str = (String) obj;
                zzcux zzcuxVar = (zzcux) this.x;
                zzfdw zzfdwVar = zzcuxVar.D;
                zzfjq zzfjqVar = zzcuxVar.C;
                zzfde zzfdeVar = zzcuxVar.A;
                zzfcs zzfcsVar = zzcuxVar.B;
                zzfdwVar.zzc(zzfjqVar.zzd(zzfdeVar, zzfcsVar, false, "", str, zzfcsVar.zzc), true == zzt.zzp().zzv(zzcuxVar.w) ? 2 : 1);
                return;
            case 8:
                zzfde zzfdeVar2 = (zzfde) obj;
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzfj)).booleanValue()) {
                    zzebv zzebvVar = (zzebv) this.x;
                    zzebvVar.e.zzi(zzfdeVar2.zzb.zzb.zze);
                    zzebvVar.e.zzj(zzfdeVar2.zzb.zzb.zzf);
                    return;
                }
                return;
            case 9:
                try {
                    ((zzcaw) this.x).zzf((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
            case 11:
                synchronized (((zzenz) this.x)) {
                    ((zzenz) this.x).c = ((zzczc) obj).zzl();
                    ((zzczc) obj).zzW();
                    break;
                }
                return;
            case 12:
                zzdua zzduaVar = (zzdua) obj;
                synchronized (((zzfcj) this.x)) {
                    ((zzfcj) this.x).C = zzduaVar;
                    if (((Boolean) zzay.zzc().zzb(zzbiy.zzcG)).booleanValue()) {
                        zzduaVar.zzd().zza = ((zzfcj) this.x).z;
                    }
                    ((zzfcj) this.x).C.zzW();
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zza(int i, int i2, int i3, int i4) {
        ((zzduv) this.x).c.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfni
    public final void zza(int i, long j) {
        ((zzfmf) this.x).zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((zzdaf) obj).f.zzh(false);
                break;
            case 4:
                zzt.zzp().zzt(th, (String) obj);
                break;
            case 8:
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzfj)).booleanValue()) {
                    Matcher matcher = zzebv.h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        ((zzebv) obj).e.zzi(Integer.parseInt(matcher.group(1)));
                    }
                }
                break;
            case 9:
                try {
                    ((zzcaw) obj).zze(zzaz.zza(th));
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
                break;
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lc7 implements zzfyk {
    public final /* synthetic */ long A;
    public final /* synthetic */ zzaa B;
    public final /* synthetic */ zzfyx w;
    public final /* synthetic */ zzcfi x;
    public final /* synthetic */ zzcfb y;
    public final /* synthetic */ zzfir z;

    public lc7(zzaa zzaaVar, zzfyx zzfyxVar, zzcfi zzcfiVar, zzcfb zzcfbVar, zzfir zzfirVar, long j) {
        this.B = zzaaVar;
        this.w = zzfyxVar;
        this.x = zzcfiVar;
        this.y = zzcfbVar;
        this.z = zzfirVar;
        this.A = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        long jB = zzt.zzB().b();
        String message = th.getMessage();
        zzt.zzp().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.B;
        zzf.zzc(zzaaVar.I, zzaaVar.A, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jB - this.A)));
        zzfjc zzfjcVarT0 = zzaa.T0(this.w, this.x);
        if (((Boolean) zzbkh.zze.zze()).booleanValue() && zzfjcVarT0 != null) {
            zzfir zzfirVar = this.z;
            zzfirVar.zze(false);
            zzfjcVarT0.zza(zzfirVar);
            zzfjcVarT0.zzg();
        }
        try {
            this.y.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        zzam zzamVar = (zzam) obj;
        zzfjc zzfjcVarT0 = zzaa.T0(this.w, this.x);
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzgB)).booleanValue();
        zzcfb zzcfbVar = this.y;
        zzfir zzfirVar = this.z;
        if (!zBooleanValue) {
            try {
                zzcfbVar.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzcgn.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbkh.zze.zze()).booleanValue() || zzfjcVarT0 == null) {
                return;
            }
            zzfirVar.zze(false);
            zzfjcVarT0.zza(zzfirVar);
            zzfjcVarT0.zzg();
            return;
        }
        long jB = zzt.zzB().b() - this.A;
        zzaa zzaaVar = this.B;
        try {
            if (zzamVar == null) {
                zzcfbVar.zzc(null, null, null);
                zzf.zzc(zzaaVar.I, zzaaVar.A, "sgs", new Pair("rid", "-1"));
                zzfirVar.zze(true);
                if (!((Boolean) zzbkh.zze.zze()).booleanValue() || zzfjcVarT0 == null) {
                    return;
                }
                zzfjcVarT0.zza(zzfirVar);
                zzfjcVarT0.zzg();
                return;
            }
            try {
                String strOptString = new JSONObject(zzamVar.zzb).optString("request_id", "");
                if (TextUtils.isEmpty(strOptString)) {
                    zzcgn.zzj("The request ID is empty in request JSON.");
                    zzcfbVar.zzb("Internal error: request ID is empty in request JSON.");
                    zzf.zzc(zzaaVar.I, zzaaVar.A, "sgf", new Pair("sgf_reason", "rid_missing"));
                    zzfirVar.zze(false);
                    if (!((Boolean) zzbkh.zze.zze()).booleanValue() || zzfjcVarT0 == null) {
                        return;
                    }
                    zzfjcVarT0.zza(zzfirVar);
                    zzfjcVarT0.zzg();
                    return;
                }
                zzaa.L0(zzaaVar, strOptString, zzamVar.zzb, zzaaVar.A);
                Bundle bundle = zzamVar.zzc;
                if (zzaaVar.N && bundle != null && bundle.getInt(zzaaVar.P, -1) == -1) {
                    bundle.putInt(zzaaVar.P, zzaaVar.Q.get());
                }
                if (zzaaVar.M && bundle != null && TextUtils.isEmpty(bundle.getString(zzaaVar.O))) {
                    if (TextUtils.isEmpty(zzaaVar.S)) {
                        zzaaVar.S = zzt.zzq().zzc(zzaaVar.x, zzaaVar.R.zza);
                    }
                    bundle.putString(zzaaVar.O, zzaaVar.S);
                }
                zzcfbVar.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                zzf.zzc(zzaaVar.I, zzaaVar.A, "sgs", new Pair("tqgt", String.valueOf(jB)));
                zzfirVar.zze(true);
                if (!((Boolean) zzbkh.zze.zze()).booleanValue() || zzfjcVarT0 == null) {
                    return;
                }
                zzfjcVarT0.zza(zzfirVar);
                zzfjcVarT0.zzg();
            } catch (JSONException e2) {
                zzcgn.zzj("Failed to create JSON object from the request string.");
                zzcfbVar.zzb("Internal error for request JSON: " + e2.toString());
                zzf.zzc(zzaaVar.I, zzaaVar.A, "sgf", new Pair("sgf_reason", "request_invalid"));
                zzfirVar.zze(false);
                if (!((Boolean) zzbkh.zze.zze()).booleanValue() || zzfjcVarT0 == null) {
                    return;
                }
                zzfjcVarT0.zza(zzfirVar);
                zzfjcVarT0.zzg();
            }
        } catch (RemoteException e3) {
            zzfirVar.zze(false);
            zzcgn.zzh("", e3);
        } finally {
            if (((Boolean) zzbkh.zze.zze()).booleanValue() && zzfjcVarT0 != null) {
                zzfjcVarT0.zza(zzfirVar);
                zzfjcVarT0.zzg();
            }
        }
    }
}

package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzcmn;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c56 implements zzbpq {
    public final /* synthetic */ int a;

    public /* synthetic */ c56(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        switch (this.a) {
            case 0:
                zzcmn zzcmnVar = (zzcmn) obj;
                zzbln zzblnVarZzM = zzcmnVar.zzM();
                if (zzblnVarZzM == null || (jSONObjectZzb = zzblnVarZzM.zzb()) == null) {
                    zzcmnVar.zze("nativeClickMetaReady", new JSONObject());
                } else {
                    zzcmnVar.zze("nativeClickMetaReady", jSONObjectZzb);
                }
                break;
            case 1:
                zzt.zzk().zzg();
                break;
            case 2:
                zzbln zzblnVarZzM2 = ((zzcmn) obj).zzM();
                if (zzblnVarZzM2 != null) {
                    zzblnVarZzM2.zzc();
                }
                break;
            default:
                zzcmn zzcmnVar2 = (zzcmn) obj;
                if (map.keySet().contains("start")) {
                    zzcmnVar2.zzP().zzk();
                } else if (map.keySet().contains("stop")) {
                    zzcmnVar2.zzP().zzl();
                } else if (map.keySet().contains("cancel")) {
                    zzcmnVar2.zzP().zzj();
                }
                break;
        }
    }
}

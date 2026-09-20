package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a56 implements zzbpq {
    public final /* synthetic */ int a;

    public /* synthetic */ a56(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectMo46zza;
        switch (this.a) {
            case 0:
                zzcmn zzcmnVar = (zzcmn) obj;
                zzbln zzblnVarZzM = zzcmnVar.zzM();
                if (zzblnVarZzM == null || (jSONObjectMo46zza = zzblnVarZzM.mo46zza()) == null) {
                    zzcmnVar.zze("nativeAdViewSignalsReady", new JSONObject());
                } else {
                    zzcmnVar.zze("nativeAdViewSignalsReady", jSONObjectMo46zza);
                }
                break;
            case 1:
                zzcmn zzcmnVar2 = (zzcmn) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    zze.zza("Missing App Id, cannot show LMD Overlay without it");
                } else {
                    zzfqj zzfqjVarZzj = zzfqk.zzj();
                    zzfqjVarZzj.zzb((String) map.get("appId"));
                    zzfqjVarZzj.zzh(zzcmnVar2.getWidth());
                    zzfqjVarZzj.zzg(zzcmnVar2.zzH().getWindowToken());
                    if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                        zzfqjVarZzj.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
                    } else {
                        zzfqjVarZzj.zzd(81);
                    }
                    if (map.containsKey("verticalMargin")) {
                        zzfqjVarZzj.zze(Float.parseFloat((String) map.get("verticalMargin")));
                    } else {
                        zzfqjVarZzj.zze(0.02f);
                    }
                    if (map.containsKey("enifd")) {
                        zzfqjVarZzj.zza((String) map.get("enifd"));
                    }
                    try {
                        zzt.zzk().zzj(zzcmnVar2, zzfqjVarZzj.zzi());
                    } catch (NullPointerException e) {
                        zzt.zzp().zzt(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                        zze.zza("Missing parameters for LMD Overlay show request");
                        return;
                    }
                }
                break;
            case 2:
                zzt.zzk().zzc();
                break;
            case 3:
                ((zzcmn) obj).zzan("1".equals(map.get("custom_close")));
                break;
            default:
                zzcmn zzcmnVar3 = (zzcmn) obj;
                String str = (String) map.get("action");
                if ("pause".equals(str)) {
                    zzcmnVar3.zzbn();
                } else if ("resume".equals(str)) {
                    zzcmnVar3.zzbo();
                }
                break;
        }
    }
}

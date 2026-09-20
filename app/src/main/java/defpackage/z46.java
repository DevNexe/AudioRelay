package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcmn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z46 implements zzbpq {
    public final /* synthetic */ int a;

    public /* synthetic */ z46(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        switch (this.a) {
            case 0:
                zzcmn zzcmnVar = (zzcmn) obj;
                WindowManager windowManager = (WindowManager) zzcmnVar.getContext().getSystemService("window");
                zzt.zzq();
                DisplayMetrics displayMetricsZzr = zzs.zzr(windowManager);
                int i = displayMetricsZzr.widthPixels;
                int i2 = displayMetricsZzr.heightPixels;
                int[] iArr = new int[2];
                HashMap map2 = new HashMap();
                ((View) zzcmnVar).getLocationInWindow(iArr);
                map2.put("xInPixels", Integer.valueOf(iArr[0]));
                map2.put("yInPixels", Integer.valueOf(iArr[1]));
                map2.put("windowWidthInPixels", Integer.valueOf(i));
                map2.put("windowHeightInPixels", Integer.valueOf(i2));
                zzcmnVar.zzd("locationReady", map2);
                zzcgn.zzj("GET LOCATION COMPILED");
                break;
            case 1:
                zzcmn zzcmnVar2 = (zzcmn) obj;
                zzt.zzk().zza(zzcmnVar2, zzcmnVar2.getContext());
                break;
            case 2:
                zzt.zzk().zzb();
                break;
            case 3:
                zzcmn zzcmnVar3 = (zzcmn) obj;
                if (zzcmnVar3.zzL() != null) {
                    zzcmnVar3.zzL().zza();
                }
                zzl zzlVarZzN = zzcmnVar3.zzN();
                if (zzlVarZzN == null) {
                    zzl zzlVarZzO = zzcmnVar3.zzO();
                    if (zzlVarZzO == null) {
                        zzcgn.zzj("A GMSG tried to close something that wasn't an overlay.");
                    } else {
                        zzlVarZzO.zzb();
                    }
                } else {
                    zzlVarZzN.zzb();
                }
                break;
            case 4:
                ((zzcmn) obj).zzak(!Boolean.parseBoolean((String) map.get("disabled")));
                break;
            default:
                zzcmn zzcmnVar4 = (zzcmn) obj;
                if (map.keySet().contains("start")) {
                    zzcmnVar4.zzau(true);
                }
                if (map.keySet().contains("stop")) {
                    zzcmnVar4.zzau(false);
                }
                break;
        }
    }
}

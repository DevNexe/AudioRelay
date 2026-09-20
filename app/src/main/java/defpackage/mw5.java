package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzawi;
import com.google.android.gms.internal.ads.zzaws;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.android.gms.internal.ads.zzpo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mw5 implements zzaux, zzaws, zzbai, zzgoq, zzbtz, zzpo {
    public final /* synthetic */ int w;

    @Override // com.google.android.gms.internal.ads.zzpo
    public final int zza(zzaf zzafVar) {
        return zzafVar.zzp != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    /* JADX INFO: renamed from: zza */
    public final zzauv[] mo48zza() {
        switch (this.w) {
            case 1:
                return new zzauv[]{new zzavn(0)};
            default:
                return new zzauv[]{new zzawi()};
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }
}

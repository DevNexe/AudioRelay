package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcmu;
import com.google.android.gms.internal.ads.zzfyk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pa6 implements zzfyk {
    public final /* synthetic */ List w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Uri y;
    public final /* synthetic */ zzcmu z;

    public pa6(zzcmu zzcmuVar, List list, String str, Uri uri) {
        this.z = zzcmuVar;
        this.w = list;
        this.x = str;
        this.y = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzcgn.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.y)));
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        int i = zzcmu.zzb;
        this.z.c(this.x, (Map) obj, this.w);
    }
}

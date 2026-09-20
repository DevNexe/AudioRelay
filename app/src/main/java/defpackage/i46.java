package defpackage;

import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class i46 implements zzake {
    public final /* synthetic */ String w;
    public final /* synthetic */ v46 x;

    public i46(String str, v46 v46Var) {
        this.w = str;
        this.x = v46Var;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zza(zzakj zzakjVar) {
        zzcgn.zzj("Failed to load URL: " + this.w + "\n" + zzakjVar.toString());
        this.x.zza(null);
    }
}

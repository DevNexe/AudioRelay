package defpackage;

import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzcgm;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k46 extends zzalf {
    public final /* synthetic */ byte[] K;
    public final /* synthetic */ Map L;
    public final /* synthetic */ zzcgm M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k46(int i, String str, v46 v46Var, i46 i46Var, byte[] bArr, Map map, zzcgm zzcgmVar) {
        super(i, str, v46Var, i46Var);
        this.K = bArr;
        this.L = map;
        this.M = zzcgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalf, com.google.android.gms.internal.ads.zzaka
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void c(String str) {
        this.M.zzg(str);
        super.c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final Map zzl() {
        Map map = this.L;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final byte[] zzx() {
        byte[] bArr = this.K;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}

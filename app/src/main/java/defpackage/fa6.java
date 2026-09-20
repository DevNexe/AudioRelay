package defpackage;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fa6 extends zzfo {
    public final Map w;

    public fa6(int i, Map map, zzfa zzfaVar, int i2) {
        super(GM.a("Response code: ", i), zzfaVar, AdError.SERVER_ERROR_CODE, i2);
        this.w = map;
    }
}

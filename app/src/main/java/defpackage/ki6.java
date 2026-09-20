package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzeum;

/* JADX INFO: loaded from: classes3.dex */
public final class ki6 implements zzeum {
    public final String a;
    public final String b;
    public final Bundle c;

    public /* synthetic */ ki6(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        bundle.putBundle("iab_consent_info", this.c);
    }
}

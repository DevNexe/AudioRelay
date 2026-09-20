package defpackage;

import com.google.android.gms.internal.ads.zzglp;
import com.google.android.gms.internal.ads.zzgmd;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class xs6 extends ThreadLocal {
    public final /* synthetic */ zzgmd a;

    public xs6(zzgmd zzgmdVar) {
        this.a = zzgmdVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        zzgmd zzgmdVar = this.a;
        try {
            Mac mac = (Mac) zzglp.zzb.zza(zzgmdVar.b);
            mac.init(zzgmdVar.c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}

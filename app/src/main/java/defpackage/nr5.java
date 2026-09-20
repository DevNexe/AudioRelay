package defpackage;

import com.google.android.gms.internal.ads.zzglp;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class nr5 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            case 2:
                try {
                    return (Cipher) zzglp.zza.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            default:
                try {
                    return (Cipher) zzglp.zza.zza("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }
}

package defpackage;

import com.google.android.gms.internal.ads.zzglp;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class ey5 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return ByteBuffer.allocate(32);
            case 1:
                try {
                    return (Cipher) zzglp.zza.zza("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 2:
                try {
                    return (Cipher) zzglp.zza.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }

    public ey5() {
        this.a = 0;
    }
}

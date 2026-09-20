package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class zzfo extends zzew {
    public final zzfa zzb;
    public final int zzc;

    public zzfo(zzfa zzfaVar, int i, int i2) {
        super(a(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzfaVar;
        this.zzc = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE;
        }
        return i;
    }

    public static zzfo zza(IOException iOException, zzfa zzfaVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !zzfrm.zza(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        }
        return i2 == 2007 ? new zzfn(iOException, zzfaVar) : new zzfo(iOException, zzfaVar, i2, i);
    }

    public zzfo(IOException iOException, zzfa zzfaVar, int i, int i2) {
        super(iOException, a(i, i2));
        this.zzb = zzfaVar;
        this.zzc = i2;
    }

    public zzfo(String str, zzfa zzfaVar, int i, int i2) {
        super(str, a(i, i2));
        this.zzb = zzfaVar;
        this.zzc = i2;
    }

    public zzfo(String str, IOException iOException, zzfa zzfaVar, int i, int i2) {
        super(str, iOException, a(i, i2));
        this.zzb = zzfaVar;
        this.zzc = i2;
    }
}

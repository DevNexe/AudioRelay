package defpackage;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzym;
import com.google.android.gms.internal.ads.zzyr;

/* JADX INFO: loaded from: classes3.dex */
public final class qw5 extends zzyr {
    public qw5(zzej zzejVar, long j, long j2) {
        super(new zzym(), new d7G(zzejVar), j, j + 1, 0L, j2, 188L, AdError.NETWORK_ERROR_CODE);
    }

    public static /* bridge */ /* synthetic */ int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}

package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfw;
import com.google.android.gms.internal.ads.zzfx;
import com.google.android.gms.internal.ads.zzrv;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class na7 implements zzev {
    public final zzev a;
    public final int b;
    public final zzrv c;
    public final byte[] d;
    public int e;

    public na7(zzfw zzfwVar, int i, zzrv zzrvVar) {
        zzdd.zzd(i > 0);
        this.a = zzfwVar;
        this.b = i;
        this.c = zzrvVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        zzev zzevVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (zzevVar.zza(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iZza = zzevVar.zza(bArr3, i4, i6);
                        if (iZza != -1) {
                            i4 += iZza;
                            i6 -= iZza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.zza(new zzed(bArr3, i5));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int iZza2 = zzevVar.zza(bArr, i, Math.min(i3, i2));
        if (iZza2 != -1) {
            this.e -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(zzfx zzfxVar) {
        zzfxVar.getClass();
        this.a.zzf(zzfxVar);
    }
}

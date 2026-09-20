package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqk;

/* JADX INFO: loaded from: classes3.dex */
public final class bm6 extends zzfqj {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zza(String str) {
        this.f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzb(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzc(int i) {
        this.g = (byte) (this.g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzd(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zze(float f) {
        this.d = f;
        this.g = (byte) (this.g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzf(boolean z) {
        this.g = (byte) (this.g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzg(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqj zzh(int i) {
        this.e = i;
        this.g = (byte) (this.g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final zzfqk zzi() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new cm6(iBinder, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

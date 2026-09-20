package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfqk;

/* JADX INFO: loaded from: classes3.dex */
public final class cm6 extends zzfqk {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public /* synthetic */ cm6(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqk) {
            zzfqk zzfqkVar = (zzfqk) obj;
            if (this.a.equals(zzfqkVar.zze())) {
                zzfqkVar.zzi();
                String str2 = this.b;
                if (str2 != null ? str2.equals(zzfqkVar.zzg()) : zzfqkVar.zzg() == null) {
                    if (this.c == zzfqkVar.zzc() && Float.floatToIntBits(this.d) == Float.floatToIntBits(zzfqkVar.zza())) {
                        zzfqkVar.zzb();
                        zzfqkVar.zzh();
                        if (this.e == zzfqkVar.zzd() && ((str = this.f) != null ? str.equals(zzfqkVar.zzf()) : zzfqkVar.zzf() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.b;
        int iHashCode2 = (((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 583896283) ^ this.e) * 1000003;
        String str2 = this.f;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = N.a("OverlayDisplayShowRequest{windowToken=", this.a.toString(), ", stableSessionToken=false, appId=");
        sbA.append(this.b);
        sbA.append(", layoutGravity=");
        sbA.append(this.c);
        sbA.append(", layoutVerticalMargin=");
        sbA.append(this.d);
        sbA.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        sbA.append(this.e);
        sbA.append(", adFieldEnifd=");
        return i5.b(sbA, this.f, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final float zza() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final int zzc() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final int zzd() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final IBinder zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final String zzf() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final String zzg() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final boolean zzi() {
        return false;
    }
}

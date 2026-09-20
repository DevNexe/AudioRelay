package defpackage;

import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmh;

/* JADX INFO: loaded from: classes3.dex */
public final class ll6 extends zzfmg {
    public String a;
    public boolean b;
    public boolean c;
    public byte d;

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final zzfmg zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final zzfmg zzb(boolean z) {
        this.c = true;
        this.d = (byte) (this.d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final zzfmg zzc(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final zzfmh zzd() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new ml6(str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

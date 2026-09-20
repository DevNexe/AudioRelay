package defpackage;

import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzayk;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class h26 implements zzayk {
    public final int a;
    public final /* synthetic */ i26 b;

    public h26(i26 i26Var, int i) {
        this.b = i26Var;
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final int zzb(zzast zzastVar, zzaun zzaunVar, boolean z) {
        i26 i26Var = this.b;
        if (i26Var.P || i26Var.d()) {
            return -3;
        }
        return ((zzayj) i26Var.J.valueAt(this.a)).zzf(zzastVar, zzaunVar, z, i26Var.a0, i26Var.X);
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzc() throws IOException {
        this.b.D.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzd(long j) {
        i26 i26Var = this.b;
        zzayj zzayjVar = (zzayj) i26Var.J.valueAt(this.a);
        if (!i26Var.a0 || j <= zzayjVar.zzg()) {
            zzayjVar.zzn(j, true);
        } else {
            zzayjVar.zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final boolean zze() {
        i26 i26Var = this.b;
        return i26Var.a0 || (!i26Var.d() && ((zzayj) i26Var.J.valueAt(this.a)).zzm());
    }
}

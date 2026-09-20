package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.QnHx;
import com.google.android.gms.internal.measurement.zzbz;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z66 implements fy6 {
    public final /* synthetic */ CQf a;

    public z66(CQf cQf) {
        this.a = cQf;
    }

    @Override // defpackage.fy6
    public final List a(String str, String str2) {
        return this.a.g(str, str2);
    }

    @Override // defpackage.fy6
    public final void b(Bundle bundle, String str, String str2) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new va6(cQf, str, str2, bundle));
    }

    @Override // defpackage.fy6
    public final Map c(String str, String str2, boolean z) {
        return this.a.h(str, str2, z);
    }

    @Override // defpackage.fy6
    public final void d(Bundle bundle) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new nd6(cQf, bundle, 2));
    }

    @Override // defpackage.fy6
    public final void e(Bundle bundle, String str, String str2) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new ve6(cQf, str, str2, bundle, true));
    }

    @Override // defpackage.fy6
    public final int zza(String str) {
        return this.a.d(str);
    }

    @Override // defpackage.fy6
    public final long zzb() {
        return this.a.e();
    }

    @Override // defpackage.fy6
    public final String zzh() {
        CQf cQf = this.a;
        cQf.getClass();
        zzbz zzbzVar = new zzbz();
        cQf.c(new rd6(cQf, zzbzVar, 0));
        return zzbzVar.M0(50L);
    }

    @Override // defpackage.fy6
    public final String zzi() {
        CQf cQf = this.a;
        cQf.getClass();
        zzbz zzbzVar = new zzbz();
        cQf.c(new rd6(cQf, zzbzVar, 1));
        return zzbzVar.M0(500L);
    }

    @Override // defpackage.fy6
    public final String zzj() {
        CQf cQf = this.a;
        cQf.getClass();
        zzbz zzbzVar = new zzbz();
        cQf.c(new nd6(cQf, zzbzVar, 1));
        return zzbzVar.M0(500L);
    }

    @Override // defpackage.fy6
    public final String zzk() {
        CQf cQf = this.a;
        cQf.getClass();
        zzbz zzbzVar = new zzbz();
        cQf.c(new nd6(cQf, zzbzVar, 0));
        return zzbzVar.M0(500L);
    }

    @Override // defpackage.fy6
    public final void zzp(String str) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new zb6(cQf, str, 1));
    }

    @Override // defpackage.fy6
    public final void zzr(String str) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new QnHx(cQf, str, 2));
    }
}

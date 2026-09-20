package defpackage;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kx2 extends cx1 implements j81<PackageInfo, String> {
    public final /* synthetic */ jx2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx2(jx2 jx2Var) {
        super(1);
        this.w = jx2Var;
    }

    @Override // defpackage.j81
    public final String invoke(PackageInfo packageInfo) {
        return this.w.a.getPackageManager().getApplicationLabel(packageInfo.applicationInfo).toString();
    }
}

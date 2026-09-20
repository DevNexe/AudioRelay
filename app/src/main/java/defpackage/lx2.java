package defpackage;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class lx2 extends cx1 implements j81<PackageInfo, String> {
    public static final lx2 w = new lx2();

    public lx2() {
        super(1);
    }

    @Override // defpackage.j81
    public final String invoke(PackageInfo packageInfo) {
        return packageInfo.packageName;
    }
}

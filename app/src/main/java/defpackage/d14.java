package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d14 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ d14(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                Throwable th2 = (Throwable) ((jl3) obj2).w;
                return th2 != null ? vk4.e(th2) : vk4.e(th);
            default:
                PackageInfo packageInfo = (PackageInfo) obj;
                String string = ((jx2) obj2).a.getPackageManager().getApplicationLabel(packageInfo.applicationInfo).toString();
                String str = packageInfo.packageName;
                String str2 = packageInfo.versionName;
                if (str2 == null) {
                    str2 = "";
                }
                return new gd(string, str, str2, Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode, packageInfo.applicationInfo.icon);
        }
    }
}

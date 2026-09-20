package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class nx2 {
    public final Context a;

    public nx2(Context context) {
        this.a = context;
    }

    public final ApplicationInfo a(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo b(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.a;
        if (callingUid == iMyUid) {
            return fp1.h0(context);
        }
        if (!x53.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}

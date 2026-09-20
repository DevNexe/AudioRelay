package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class q32 extends cx1 implements j81<Activity, sd5> {
    public final /* synthetic */ p32 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q32(p32 p32Var) {
        super(1);
        this.w = p32Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Activity activity) {
        Activity activity2 = activity;
        p32 p32Var = this.w;
        Locale localeD = p32Var.b.d();
        p32Var.c.getClass();
        he5.a(activity2, localeD);
        Context applicationContext = activity2.getApplicationContext();
        if (applicationContext != activity2) {
            he5.a(applicationContext, localeD);
        }
        try {
            int i = activity2.getPackageManager().getActivityInfo(activity2.getComponentName(), 128).labelRes;
            if (i != 0) {
                activity2.setTitle(i);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return sd5.a;
    }
}

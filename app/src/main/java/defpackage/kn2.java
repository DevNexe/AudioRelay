package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class kn2 extends y60<yn2> {
    public static final String e = s52.e("NetworkNotRoamingCtrlr");

    public kn2(Context context, c15 c15Var) {
        super((bo2) j95.a(context, c15Var).c);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.a == co2.NOT_ROAMING;
    }

    @Override // defpackage.y60
    public final boolean c(yn2 yn2Var) {
        yn2 yn2Var2 = yn2Var;
        if (Build.VERSION.SDK_INT >= 24) {
            return (yn2Var2.a && yn2Var2.d) ? false : true;
        }
        s52.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !yn2Var2.a;
    }
}
